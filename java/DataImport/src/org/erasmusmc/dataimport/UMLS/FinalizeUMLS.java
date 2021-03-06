/*
 * Concept profile generation tool suite
 * Copyright (C) 2015 Biosemantics Group, Erasmus University Medical Center,
 *  Rotterdam, The Netherlands
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package org.erasmusmc.dataimport.UMLS;

import org.erasmusmc.ontology.Ontology;
import org.erasmusmc.ontology.OntologyFileLoader;
import org.erasmusmc.ontology.OntologyManager;
import org.erasmusmc.ontology.OntologyStore;
import org.erasmusmc.ontology.ontologyutilities.OntologyCurator;
import org.erasmusmc.utilities.StringUtilities;

public class FinalizeUMLS {
	public static String ontologyInfile = "/home/khettne/Projects/UMLS/UMLS2010AB_medlinefilter.ontology";
	public static String onotologyOutfile = "/home/khettne/Projects/UMLS/UMLS2010AB_medlinefilter_final.ontology";
	public static String curationFilePath = "/home/khettne/Projects/UMLS/UMLS_curation_file_updatedFor2010AB.txt";

	
	public static void main(String[] args) {
		System.out.println("Starting script: "+StringUtilities.now());

		OntologyFileLoader loader = new OntologyFileLoader();
		Ontology ontology = loader.load(ontologyInfile);
		System.out.println("Loading ontology: "+StringUtilities.now());

		OntologyCurator curator = new OntologyCurator(curationFilePath);
		curator.curateAndPrepare(ontology);
		
		ontology.setName("UMLS2010AB_medlinefilter");

		loader.save((OntologyStore)ontology, onotologyOutfile);
		OntologyManager manager = new OntologyManager();
		manager.dumpStoreInDatabase((OntologyStore)ontology);
		
		System.out.println("Done! "+StringUtilities.now());
	}

}
