let latitude;
let longitude;

//getting the current location
navigator.geolocation.getCurrentPosition((position) => {

    console.log('latitude', position.coords.latitude);
    latitude = position.coords.latitude;

    console.log('longitude', position.coords.longitude);
    longitude = position.coords.longitude;
});
function acceptProposal() {
    document.getElementById('proposal').src = 'red';
}

function rejectProposal() {
    document.getElementById('proposal').src = 'red';

}

localStorage.setItem('class','Capgemini Bangalore Batch');

// HTMLHeadingElement.style.background = 'red';



