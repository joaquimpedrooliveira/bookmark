package com.github.joaquimpedrooliveira.bookmark.view;

import javax.inject.Inject;

import br.gov.frameworkdemoiselle.lifecycle.Startup;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.transaction.Transactional;

import com.github.joaquimpedrooliveira.bookmark_business.BookmarkBC;
import com.github.joaquimpedrooliveira.bookmark_business.domain.Bookmark;

@BusinessController
public class BookmarkInitializer {
	
	@Inject
	private BookmarkBC bc;
	
	@Startup
	@Transactional
	public void load() {
		if (bc.findAll().isEmpty()) {
			bc.insert(new Bookmark("Demoiselle Portal", "http://www.frameworkdemoiselle.gov.br"));
			bc.insert(new Bookmark("Demoiselle SourceForge", "http://sf.net/projects/demoiselle"));
			bc.insert(new Bookmark("Twitter", "http://twitter.frameworkdemoiselle.gov.br"));
			bc.insert(new Bookmark("Blog", "http://blog.frameworkdemoiselle.gov.br"));
			bc.insert(new Bookmark("Wiki", "http://wiki.frameworkdemoiselle.gov.br"));
			bc.insert(new Bookmark("Bug Tracking", "http://tracker.frameworkdemoiselle.gov.br"));
			bc.insert(new Bookmark("Forum", "http://forum.frameworkdemoiselle.gov.br"));
			bc.insert(new Bookmark("SVN", "http://svn.frameworkdemoiselle.gov.br"));
			bc.insert(new Bookmark("Maven", "http://repository.frameworkdemoiselle.gov.br"));
			bc.insert(new Bookmark("Downloads", "http://download.frameworkdemoiselle.gov.br"));
		}
	}

}
