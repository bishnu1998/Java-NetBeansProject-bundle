<%@page import="java.util.List"%>
<%@page import="com.tech.blog.entities.Post"%>
<%@page import="com.tech.blog.dao.postDao"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
hello world
<div class="row">
    <%
        postDao d = new postDao(ConnectionProvider.getConnection());
        List<Post> posts = d.getAllPosts();

        for (Post p : posts) {
    %>

    <div class="col-md-6 mt-2">
        <div class="card">

            <div class="card-body">
                <img class="card-img-top" src="blog_pic/<%= p.getPpic() %>" alt="Card image cap">
                <d><%= p.getPtitle()%></d>
                <p><%= p.getPcontent()%></p>
                <pre><%= p.getPcode()%>
        </div>
        
    </div>
</div>


    <%
        }


    %>

</div>