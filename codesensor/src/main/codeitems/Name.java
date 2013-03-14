package main.codeitems;

public class Name extends CodeItem
{
	public Name()
	{
		nodeTypeName = "NAME";
	}
	
	public String getCodeStr()
	{
		if(codeStr != null)
			return codeStr;
		codeStr = rootRule.getText();
		return codeStr;
	}
	
}