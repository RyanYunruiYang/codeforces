#include <iostream>
#include <math.h>

int main() {
  long n,k;
  std::cin >> n >> k;

  long numways [n+1];
  long total [n+1];
  for(int i=0; i<n+1; i++){
    numways[i] = 0;
    total[i] = 0;
  }
  numways[0] = 1;


  long step = k;
//464662708
  // while((step-5)*(step+1-5)-k*(k+1)< 2*n) {
  while(step < 10+sqrt(2*n+k*(k+1))) {
    long newnumways [n+1];
    for(int i=0;i<n+1; i++){
      newnumways[i] = 0;
    }

    for(int i=0; i<n+1; i++){
      int adder = i+step;
      while(adder<= n){
        newnumways[adder] = (newnumways[adder]+numways[i])%998244353;
        adder+=step;
      }
      total[i] = (total[i]+newnumways[i])%998244353;

    }
    // numways = newnumways.copy;
    for(int i=0;i<n+1;i++){
      numways[i] = newnumways[i];
    }

    step+=1;
  }
  for(int i=1; i<=n; i++){
    std::cout << (total[i]%998244353) << " ";
  }



}
