<jsp:include page="${request.contextPath}/header"/>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<br>
</div>
		</div>
	</div>
    
    <script>window.alert($message);</script>
<div class="latest-albums">
		<div class="container">
			<h3 class="agileits_w3layouts_head">Log-<span>IN</span></h3>
			<div class="wthree_latest_albums_grids gallery">
				<div class="wthree_mail_grid_right">
					<form action="loginAction" method="post">
						<input type="text" name="username" placeholder="Username" required="">
                        <input type="password" name="pass" placeholder="Password" required="">
                        <br>
                        <br>
                        <a href="forgetpass.jsp" class="w3-btn w3-black">Forgot password?</a>
                        <br>
                        <br>
						<input type="submit" value="Login" name="submit" >
					</form>
				</div>
                </div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<jsp:include page="${request.contextPath}/footer" />