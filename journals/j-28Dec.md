DONE
<ul>
<li>Servlet skeleton</li>
<li> Info java classes </li></ul>

TODO
<ul>
<li> 
dispatch resume star info onto the responsive page. <strong>Partially done: about part is done.</strong>
</li>
</ul>

PROBLEMS
<ul>
    <li> How do I maintain user's responsive html on my server? 
    They would have 
    <ul>
<li>the same js file, </li>
<li>
similar css assets with different variable values,</li>
<li> different content. (content is kept in my database in JSON format).</li></ul></li>
<li>
Safety issues when I keep user's personal info in my server.
</li>
</ul>

DISCOVERIES
<ul>
<li>
Can you believe the style casting rule is different in html and jsp?
See the comments at responsive.jsp.
</li>
<li>
so ${star.contactDetails.address} works. As long as they are all java beans, jsp can find the property wanted.
</li>
<li>
stylesheets and js should not be included in WEB-INF, as the servlet will refuse 
the browser to get it.
<strong>All content that you want to be used by the browser should be included
in the web folder, out of the WEB-INF folder. (got me struggling two hours trying to see why
the style sheet does not load!)</strong>
</li>
</ul>