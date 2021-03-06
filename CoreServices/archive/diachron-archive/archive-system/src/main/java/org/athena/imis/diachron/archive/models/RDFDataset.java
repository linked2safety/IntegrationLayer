package org.athena.imis.diachron.archive.models;

/**
 * This class implements Dataset for RDF Dataset objects.
 *
 */
public class RDFDataset extends AbstractDiachronEntity implements Dataset  {
	private RecordSet recSet;

	/**
	 * Fetches the record set of this RDFDataset.
	 * @return the recSet
	 */
	public RecordSet getRecordSet() {
		return recSet;
	}

	/**
	 * Sets the record set of this RDFDataset.
	 * @param recSet the recSet to set
	 */
	public void setRecordSet(RecordSet recSet) {
		this.recSet = recSet;
	}


	
}
