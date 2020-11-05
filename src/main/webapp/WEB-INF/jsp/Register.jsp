<jsp:include page="${request.contextPath}/header"/>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<br>
</div>
		</div>
	</div>
    

       <div class="latest-albums">
	<div class="container">
        <div class="w3_agile_breadcrumbs_right">
	<div class="wthree_latest_albums_grids gallery">
                 <h3 class="agileits_w3layouts_head">Register-Now</h3>
			<p class="w3_agileits_para">Made For Developers</p>
				<div class="col-md-8 agile_mail_grid_left">
				<form action="Register" method="post">
					<input type="text" name="fname" placeholder="First Name" required="">
        			        <input type="text" name="lname" placeholder="Last Name" required="">
        			        <input type="text" name="secq" placeholder="Enter Security Question" required="">
        			        <input type="text" name="seca" placeholder="Answer of security question, will be used to recovery your account incase you forget your password" required="">
					<input type="email" name="email" placeholder="Email" required="">
        			        <input type="password" name="password" placeholder="Password" required="">
                                        <textarea name="what" placeholder="what you develop ?" required=""></textarea>
					<input type="text" name="git" placeholder="Github Username" required="">
					<textarea name="why" placeholder="Explain in short why you need our service ?" required=""></textarea>
					<input type="submit" value="Submit Now" name ="submit1" >
                        <br>
                        <br>
				</form>
				</div>
         </div>
         </div>
         </div>
</div>
    
    
    
    
    
    
    
    
    
    
    
    	<jsp:include page="${request.contextPath}/footer" />