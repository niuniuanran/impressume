DONE
<ul>
<li>Successfully dispatched a star's information onto the responsive page,
both from direct java object, or from json file!</li>
<li>Got a substitute styling when the user did not submit a photo.</li>
</ul>

TODO
<ul>
<li>
Write the actually home page
</li>
<li>
Write a responsive form that lets user put in their information, and create an object for the user.
</li>
</ul>

DISCOVERIES
<ul>
<li>Learnt about how to access file in servlet folders, and web folders.
<ul>
<li> 
Loading file from the src folder, in a servlet class:
<br>
 Thread.currentThread().getContextClassLoader().getResourceAsStream("star-1.JSON")
</li>
<li>
loading from a jsp in the web folder, from the web folder: <br>
The relative path starts from web. try to always use c:url tags, so they figure it out for you. Here you can write absolute 
path, and you think of /web/ as the root.
</li>
</ul>
</li>


</ul>