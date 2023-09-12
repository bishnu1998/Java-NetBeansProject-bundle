
package tags;

import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class tagHandler extends TagSupport {
   
   @Override
   public int doStartTag() throws JspException{
      
      try{
         //task..:tags
         JspWriter out=pageContext.getOut();
         out.println("<h1>this is my costume tags from tag handler</h1>");
         out.println(new Date().toString());
         
      }catch(Exception e){
         e.printStackTrace();
      }
      return SKIP_BODY;
      
   }
}
