function bark(){
 console.log("The doggy went:");
 barks=10;
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
 let times;
 bark();
 console.log("The dog barked "+times+" times!");
 console.log("This is an example of side effect");
}
main()