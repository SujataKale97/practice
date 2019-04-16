node {
      for (i=0; i<2; i++) { 
           stage "Stage #"+i
           print 'Hello, world !'
           if (i==0)
           {
               echo 'Running on Stage #0'
           }
           else {
               echo 'Running on Stage #1'
           }
      }
}
