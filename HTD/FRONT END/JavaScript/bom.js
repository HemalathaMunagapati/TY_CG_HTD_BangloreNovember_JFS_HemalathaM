// navigator.geolocation.getCurrentPosition((position)=>{
//     console.log('latitude :',position.coords.latitude);
//     latitude=position.coords.latitude;

//     console.log('longitude:',position.coords.longitude)
//     longitude=position.coords.longitude;
// });

// document.getElementById('heading').style.background='green';
let heading=document.getElementById('head');
heading.style.background='green';
heading.style.color='white';

function acceptproposal(){
    document.getElementById('proposal').src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROP8Af_FdlFeHp0GG0UgMg0akwRsEbFFVnYpRKtqhwchhFu1Qw2A&s"

}

function rejectproposal(){
    document.getElementById('proposal').src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZjS7lOOC4PgTPbc12fwPJIAfQruRR6DzwWcY2f2FdsFBXbc5p&s"
}