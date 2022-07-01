def call(String stageName){
  
  if ("${stageName}" == "build")
     {
       sh "mvn clean package"
     }
  else if ("${stageName}" == "codequality")
     {
       sh "mvn clean sonar:sonar"
     }
  else if ("${stageName}" == "artifacts")
     {
       sh "mvn clean deploy"
     }
}
