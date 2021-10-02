package srbean;
public class priceinfo
{
private String name;
private float price;
public void setProduct(String na)
{
this.name=na;
}
public String getPrice()
{
if(name.equals("wrox"))
return "Price:600rs";
if(name.equals("ed roman"))
return "Price:400rs";
if(name.equals("jakarta Struts"))
return "Price:700rs";
else
return "Sorry Invalied entry";
}
}