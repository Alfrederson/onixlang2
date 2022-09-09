let times = 0;
function fart(loudness,smell){
 let power_rating = loudness*pow(smell,2);
}

function somar(a,b){
 return a+b;
}

function bark(){
 console.log("The doggy went:");
 let barks = 10;
 while(barks>0){
  barks=barks-1;
  console.log("WOOF!");
  times=times+1;
  if(times==1){
   console.log("First woof");
  }else if(times==2){
   console.log("Second woof");
  }else if(times==3){
   console.log("Third woof");
  }else{
   console.log("SHUT UP, DOG");
  };
 };
}
function main(){
 bark();
 x=99;
 y=99;
 z=99;
 console.log("The dog barked "+times+" times!");
 console.log("This is an example of side effect");
 console.log(somar(somar(x,y),z));
}
main()