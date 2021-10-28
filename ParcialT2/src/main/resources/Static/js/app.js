const app = (() => {
    var map;
    const initMap = () => {
        map = new google.maps.Map(document.getElementById('map'), {
            center: { lat: -34.397, lng: 150.644 },
            zoom: 4
        });
    }
    const getData = () => {
        var city = $('#input').val();
        apiclient.getDataByCity(city, (resp, error) => {
            if (error != null) {
                alert('problems');
                return;
            }
            addToCard(resp);
        })
    }
    const addTo = data => {
        $('#data').empty();
        console.log()
        $('#data').append(

            <p>country: ${data.country}</p>
            <p>Numdeaths: ${data.Numdeaths}</p
            <p>Numinfected: ${data.Numinfected}</p
            <p>Numcured: ${data.Numcured}</p


        var marker = new google.maps.Marker({
            position: { lat: data.coord.lat, lng: data.coord.lon },
            map: map
        });

        map.setCenter(new google.maps.LatLng(data.coord.lat,data.coord.lon));

    }

    return {
        loadData: () => {
            initMap();
        },

        click: () => {
            getData();
        }
    }
