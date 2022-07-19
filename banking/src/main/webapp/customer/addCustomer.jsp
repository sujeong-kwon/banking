<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<div class="container">
		<a class="logo">
			<img src="">
		</a>
		<div class="inner">
			<div class="title">
				<h1>
					<span>Login</span>
				</h1>
				<p>
					Don't have an account yet?
					<a href="/signup">Signup here</a>
				</p>
			</div>
			<div class="form-group">
				<input placeholder="Email" type="text" name="email">
			</div>
			<div class="form-group">
				<input placeholder="Password" type="password" name="password">
				<img class="show" src="/assets/img/preview.png">
			</div>
			<div class="signup-btn">
				<strong>Login</strong>
			</div>
			<a href="/recovery" style ="font-size: 14px; opacity: 0.5;">Forgot your password?</a>
			<div>
			</div>
		</div>
	</div>
</body>
</html>