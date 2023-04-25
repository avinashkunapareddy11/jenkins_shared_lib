def call(String project, String ImageTag, String hubUser){
   
   withCredentials([usernamePassword(
            credentialsId: "docker",
            usernameVariable: "USER",
            passwordVariable: "PASS"
   )])   {
          sh "docker login -u '$USER' -p '$PASS'"
   }
   sh "docker Image push ${hubUser}/${project}:${ImageTag}"
   sh "docker Image push ${hubUser}/${project}:latest"
}