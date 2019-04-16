node {
      for (i=0; i<2; i++) { 
           stage "Stage #"+i
           print 'Hello, world !'
           if (i==0)
           {
               git "https://github.com/SujataKale97/gitnew.git"
               credentialsId: 'ea4c3770-b2ed-4639-9ffc-cc3e586e454c'
               echo 'Running on Stage #0'
           }
           else {
               build 'Declarative pipeline'
               echo 'Running on Stage #1'
           }
      }
}
