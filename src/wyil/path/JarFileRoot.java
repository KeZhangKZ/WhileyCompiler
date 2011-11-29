package wyil.path;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.*;

import wyil.io.ModuleReader;
import wyil.lang.Module;
import wyil.lang.ModuleID;
import wyil.lang.PkgID;

/**
 * Represents a Jar file on the file system.
 * 
 * @author djp
 *
 */
public class JarFileRoot implements Path.Root {
	private final JarFile jf;	
	
	public JarFileRoot(String dir) throws IOException {
		this.jf = new JarFile(dir);		
	}
	
	public JarFileRoot(JarFile dir) {
		this.jf = dir;				
	}

	public List<Path.Entry> list(PkgID pkg) throws IOException {
		String pkgname = pkg.toString().replace('.', '/');
		Enumeration<JarEntry> entries = jf.entries();
		ArrayList<Path.Entry> contents = new ArrayList<Path.Entry>();
		while (entries.hasMoreElements()) {
			JarEntry e = entries.nextElement();
			String filename = e.getName();
			int pos = filename.lastIndexOf('/');
			String tmp = filename.substring(0, pos);
			if (tmp.equals(pkgname) && filename.endsWith(".class")) {
				// strip suffix
				filename = filename.substring(pos + 1, filename.length() - 6);
				ModuleID mid = new ModuleID(pkg, filename);
				contents.add(new Entry(mid, jf, e));
			}
		}

		return contents;
	}
		
	public static class Entry implements Path.Entry {
		private final ModuleID mid;
		private final JarFile parent;
		private final JarEntry entry;

		public Entry(ModuleID mid, JarFile parent, JarEntry entry) {
			this.mid = mid;
			this.parent = parent;
			this.entry = entry;
		}

		public ModuleID id() {
			return mid;
		}

		public String location() {
			return parent.getName();
		}
		
		public String suffix() {
			String suffix = "";
			String filename = entry.getName();
			int pos = filename.lastIndexOf('.');
			if (pos > 0) {
				suffix = filename.substring(pos + 1);
			}
			return suffix;
		}
		
		public InputStream contents() throws IOException {
			return parent.getInputStream(entry);
		}

		public void close() throws IOException {

		}

		public void refresh() throws IOException {

		}
	}
}
