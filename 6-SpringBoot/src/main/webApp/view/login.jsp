<!-- <script>
function valid(){
   var user= document.getElementByName("uname").value;
   var password= document.getElementByName("pwd").value;
   const errorDiv= document.getElementByName("error").value;

   if(user.trim()===''||password.trim()===''){
    errorDiv.innerText="username and password can't be empty";
    return false;
   }
  
   
   else{
    if (user === "Lakshmi" && password === "1912") {
                    errorDiv.innerText = ""; 
                    alert("login success")
                    return true; 
                } else {
                    errorDiv.innerText = "Invalid username or password.";
                    return false;   
                }

   }
}

</script> -->

<h1>Login Form</h1>
<form action="/ans">
    <label>User Name</label>
    <input type="text" name="uname"/>
   
</br>
    <label>Password</label>
    <input type="password" name="pwd"/>
   
</br>
<input type="submit" value="Login"/>

</form>