package com.client.core.datatables.tools;

import javax.servlet.http.HttpServletRequest;

public class JQueryDataTableParamModel {

	private String sEcho;
	private String sSearch;
	private String sSearch_0;
	private String sSearch_1;
	private String sSearch_2;
	private String sSearch_3;
	private int iDisplayLength;
	private int iDisplayStart;
	private int iColumns;
	private int iSortingCols;
	private int iSortColumnIndex;
	private String sSortDirection;
	private String sColumns;
	private int iTotalDisplayRecords;
	private int iTotalRecords;
	private boolean dataAccessedFromDataTables;

	public JQueryDataTableParamModel() {
		super();
		this.sEcho = "";
		this.sSearch = "";
		this.sSearch_0 = "";
		this.sSearch_1 = "";
		this.sSearch_2 = "";
		this.sSearch_3 = "";
		this.sSortDirection = "";
		this.sColumns = "";
	}

    public JQueryDataTableParamModel(HttpServletRequest request) {
        super();

        if (request.getParameter("sEcho") != null && request.getParameter("sEcho") != "") {
            this.sEcho = request.getParameter("sEcho");
            this.sSearch = request.getParameter("sSearch");
            this.sSearch_0 = request.getParameter("sSearch_0");
            this.sSearch_1 = request.getParameter("sSearch_1");
            this.sSearch_2 = request.getParameter("sSearch_2");
            this.sSearch_3 = request.getParameter("sSearch_3");
            this.sColumns = request.getParameter("sColumns");
            this.iDisplayStart = Integer.parseInt(request.getParameter("iDisplayStart"));
            this.iDisplayLength = Integer.parseInt(request.getParameter("iDisplayLength"));
            this.iColumns = Integer.parseInt(request.getParameter("iColumns"));
            this.iSortingCols = Integer.parseInt(request.getParameter("iSortingCols"));
            this.iSortColumnIndex = Integer.parseInt(request.getParameter("iSortCol_0"));
            this.sSortDirection = request.getParameter("sSortDir_0");
            this.dataAccessedFromDataTables = true;
        }
    }

	public String getsEcho() {
		return sEcho;
	}

	public void setsEcho(String sEcho) {
		this.sEcho = sEcho;
	}

	public String getsSearch() {
		return sSearch;
	}

	public void setsSearch(String sSearch) {
		this.sSearch = sSearch;
	}

	public String getsSearch_0() {
		return sSearch_0;
	}

	public void setsSearch_0(String sSearch_0) {
		this.sSearch_0 = sSearch_0;
	}

	public String getsSearch_1() {
		return sSearch_1;
	}

	public void setsSearch_1(String sSearch_1) {
		this.sSearch_1 = sSearch_1;
	}

	public String getsSearch_2() {
		return sSearch_2;
	}

	public void setsSearch_2(String sSearch_2) {
		this.sSearch_2 = sSearch_2;
	}

	public String getsSearch_3() {
		return sSearch_3;
	}

	public void setsSearch_3(String sSearch_3) {
		this.sSearch_3 = sSearch_3;
	}

	public int getiDisplayLength() {
		return iDisplayLength;
	}

	public void setiDisplayLength(int iDisplayLength) {
		this.iDisplayLength = iDisplayLength;
	}

	public int getiDisplayStart() {
		return iDisplayStart;
	}

	public void setiDisplayStart(int iDisplayStart) {
		this.iDisplayStart = iDisplayStart;
	}

	public int getiColumns() {
		return iColumns;
	}

	public void setiColumns(int iColumns) {
		this.iColumns = iColumns;
	}

	public int getiSortingCols() {
		return iSortingCols;
	}

	public void setiSortingCols(int iSortingCols) {
		this.iSortingCols = iSortingCols;
	}

	public int getiSortColumnIndex() {
		return iSortColumnIndex;
	}

	public void setiSortColumnIndex(int iSortColumnIndex) {
		this.iSortColumnIndex = iSortColumnIndex;
	}

	public String getsSortDirection() {
		return sSortDirection;
	}

	public void setsSortDirection(String sSortDirection) {
		this.sSortDirection = sSortDirection;
	}

	public String getsColumns() {
		return sColumns;
	}

	public void setsColumns(String sColumns) {
		this.sColumns = sColumns;
	}

	public int getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}

	public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}

	public int getiTotalRecords() {
		return iTotalRecords;
	}

	public void setiTotalRecords(int iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}

	public boolean isDataAccessedFromDataTables() {
		return dataAccessedFromDataTables;
	}

	public void setDataAccessedFromDataTables(boolean dataAccessedFromDataTables) {
		this.dataAccessedFromDataTables = dataAccessedFromDataTables;
	}
	
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		String NEW_LINE = System.getProperty("line.separator");
		result.append("{" + NEW_LINE);
		result.append(" sEcho: " + sEcho + "," + NEW_LINE);
		result.append(" sSearch: " + sSearch + "," + NEW_LINE);
		result.append(" sSearch_0: " + sSearch_0 + "," + NEW_LINE);
		result.append(" sSearch_1: " + sSearch_1 + "," + NEW_LINE);
		result.append(" sSearch_2: " + sSearch_2 + "," + NEW_LINE);
		result.append(" sSearch_3: " + sSearch_3 + "," + NEW_LINE);
		result.append(" iDisplayLength: " + iDisplayLength + "," + NEW_LINE);
		result.append(" iDisplayStart: " + iDisplayStart + "," + NEW_LINE);
		result.append(" iColumns: " + iColumns + "," + NEW_LINE);
		result.append(" iSortingCols: " + iSortingCols + "," + NEW_LINE);
		result.append(" iSortColumnIndex: " + iSortColumnIndex + "," + NEW_LINE);
		result.append(" sSortDirection: " + sSortDirection + "," + NEW_LINE);
		result.append(" sColumns: " + sColumns + "," + NEW_LINE);
		result.append(" iTotalDisplayRecords: " + iTotalDisplayRecords + "," + NEW_LINE);
		result.append(" iTotalRecords: " + iTotalRecords + "," + NEW_LINE);
		result.append(" dataAccessedFromDataTables: " + dataAccessedFromDataTables + "," + NEW_LINE);
		result.append("}");

		return result.toString();
	}
	
	

}
