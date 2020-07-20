//register this function to Proprietary Vulnerable Functions to your organization


/*
*
*
*
* Example #1
*
*
*
*/
//Vulnerable Function #1
//Copy and paste the code below
public ResultSet requestQuery(String acctNo) throws SQLException { 
  String query = "SELECT * FROM myacts WHERE acntNo = " + acctNo;
  PreparedStatement pstmt = connection.prepareStatement(query);
  pstmt.setString( 1, request.getParameter("acnumber"));
  ResultSet results = pstmt.executeQuery( );
  return results;
}

//Patch to #1 
//Copy and paste the code below
public ResultSet requestQuery(String acctNo) throws SQLException { 
  String query = "SELECT * FROM myacts WHERE acntNo = " + acctNo;
  if(isValidAccount(acctNo)){
    return null;
  }
  PreparedStatement pstmt = connection.prepareStatement(query);
  pstmt.setString( 1, request.getParameter("acnumber"));
  ResultSet results = pstmt.executeQuery( );
  return results;
}




/*
*
*
*
* Example #2
*
*
*
*/
//Vulnerable Function #2
//Copy and paste the code below
public void executeCommand(String input) throws IOException {
  Runtime r = Runtime.getRuntime();
  String command = "";
  if(isWindows()){
  	command = "cmd -c " + input;
  } else {
    command = "bash " + input;
  }
  r.exec("/bin/sh -c some_tool" + command);
}

//Patch to #2
//Copy and paste the code below
public void executeCommand(String input) throws IOException, Exception {
  Runtime r = Runtime.getRuntime();
  String command = "";
  
  //allow only safe characters
  if (!Pattern.matches("[0-9A-Za-z@.]+", input)) {
    throw new Exception();
  }
  
  if(isWindows()){
  	command = "cmd -c " + input;
  } else {
    command = "bash " + input;
  }
  r.exec("/bin/sh -c some_tool" + command);
}