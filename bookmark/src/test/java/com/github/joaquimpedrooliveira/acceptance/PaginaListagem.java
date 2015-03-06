package com.github.joaquimpedrooliveira.acceptance;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Link;

@ScreenMap(name = "Listagem de links", location = "http://localhost:8080/bookmark/bookmark_list.jsf")
public class PaginaListagem {

	@ElementMap(name = "Link do Portal Demoiselle", locatorType = ElementLocatorType.LinkText, locator = "Demoiselle Portal")
	private Link linkPortalDemoiselle;

}
