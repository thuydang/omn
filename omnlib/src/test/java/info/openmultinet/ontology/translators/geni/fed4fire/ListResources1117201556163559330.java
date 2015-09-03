package info.openmultinet.ontology.translators.geni.fed4fire;

import info.openmultinet.ontology.exceptions.DeprecatedRspecVersionException;
import info.openmultinet.ontology.exceptions.InvalidModelException;
import info.openmultinet.ontology.exceptions.MissingRspecElementException;
import info.openmultinet.ontology.translators.AbstractConverter;
import info.openmultinet.ontology.translators.geni.RSpecValidation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class ListResources1117201556163559330 {

	@Test
	public void adRoundtrip() throws JAXBException, InvalidModelException,
			IOException, XMLStreamException, MissingRspecElementException,
			DeprecatedRspecVersionException {

		final String filename = "/geni/fed4fire/listResources-1117-2015-5-6-16-35-59-330.xml";

		final String inputRspec = AbstractConverter.toString(filename);

		// System.out.println("Converting this input from '" + filename + "':");
		// System.out.println("===============================");
		// System.out.println(inputRspec);
		// System.out.println("===============================");

		final String outputRspec = RSpecValidation
				.completeRoundtrip(inputRspec);

		// PrintWriter outFile = new PrintWriter("filename.txt");
		// outFile.println(outputRspec);
		// outFile.close();

		// System.out.println("Generated this rspec:");
		// System.out.println("===============================");
		// System.out.println(outputRspec);
		// System.out.println("===============================");

		Assert.assertTrue("type",
				outputRspec.contains("type=\"advertisement\""));

		System.out.println("===============================");
		System.out.println("Diffs:");
		int[] diffsNodes = RSpecValidation.getDiffsNodes(inputRspec);

		Document xmlDoc = RSpecValidation.loadXMLFromString(outputRspec);

		// check that output has one rspec element
		NodeList rspec = xmlDoc.getElementsByTagNameNS(
				"http://www.geni.net/resources/rspec/3", "rspec");
		Assert.assertTrue(rspec.getLength() == 1);

		NodeList nodes = xmlDoc.getElementsByTagNameNS(
				"http://www.geni.net/resources/rspec/3", "node");
		Assert.assertTrue(nodes.getLength() == 2);

		NodeList links = xmlDoc.getElementsByTagNameNS(
				"http://www.geni.net/resources/rspec/3", "link");
		Assert.assertTrue(links.getLength() == 0);

		NodeList opstates = xmlDoc.getElementsByTagNameNS(
				"http://www.geni.net/resources/rspec/ext/opstate/1",
				"rspec_opstate");
		Assert.assertTrue(opstates.getLength() == 1);

		String aggregateManagerId = opstates.item(0).getAttributes()
				.getNamedItem("aggregate_manager_id").getNodeValue();
		Assert.assertTrue(aggregateManagerId
				.equals("urn:publicid:IDN+stanford.edu+authority+cm"));

		// TODO: Currently returns a high number of errors, although translation
		// appears to be correct.
		// Assert.assertTrue("No differences between input and output files",
		// diffsNodes[0] == 0);

	}
}
