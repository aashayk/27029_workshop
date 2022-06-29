
class book
{
    constructor(id,name,price,author)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.author=author;
    }
   
}
var arrayofBook=[];
//const book1=new book(1,'earth',200,'mahesh');
 //arrayofBook.push(book1);
function getBooklist()
{     
   
     for(let i in arrayofBook)
     {
      document.getElementById("list1").innerHTML+=" Book Id: "+arrayofBook[i].id+" Book Name: "+arrayofBook[i].name+" Book Price: "+arrayofBook[i].price+" Book Author: ";
   +arrayofBook[i].author+"<br>";
   
     }
    
}
function addBook()
{
   let id=document.getElementById("id").value;
   let name=document.getElementById("name").value;
   let price=document.getElementById("price").value;
   let author=document.getElementById("author").value;
   const book2=new book(id,name,price,author);
   arrayofBook.push(book2);
   console.log("book"+id+" price "+price);
  
}
function deleteBook()
{
   let id=document.getElementById("id").value;
   
   arrayofBook.splice(index,1);
}
function editBook()
{

}
