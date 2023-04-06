#include <iostream>

int main() {
  int t, n, h, m;
  std::cin >> t;
  for(int o=0; o<t; o++){
    std::cin >> n >> h >> m;

    int miltime = 60*h + m;

    int minmin = 24*60;
    for(int i=0;i<n; i++){
      int ha, ma;
      std::cin>> ha >> ma;
      int delta = (60*ha + ma) - miltime;
      if(delta<0){
        delta = delta+24*60;
      }
      if(delta <minmin){
        minmin = delta;
      }
    }

    // std::cout << minmin << std::endl;
    std::cout << (minmin/60) << " "<< minmin%60 << std::endl;


  }


  return 0;
}
