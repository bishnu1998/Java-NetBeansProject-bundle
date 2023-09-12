
package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class tagHandler2 extends TagSupport{
   
   //seting number
   public int number;
   public void setNumber(int number){
      this.number=number;
   }
   
   //setting color
   public String color1;
   public void setColor(String color){
      this.color1=color;
   }
   
   
   @Override
   public int doStartTag() throws JspException{
      
      try{
         JspWriter out=pageContext.getOut();
         out.println("<br><h1>this is the second tag handler!!</h1>");
           
         //for color
         out.println("<div style=color="+color1+"'");
         
         out.println("<br>");
         //to print table
         for(int i=1; i<=10; i++){
            out.println("<br>"+i+"*"+number+"="+i*number);
         }
         
         out.println("</div>");
         
      }catch(Exception e){
         e.printStackTrace();
      }
      return SKIP_BODY;
   }
}
