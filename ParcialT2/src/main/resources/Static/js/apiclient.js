const apiclient = (() => {
    return {
        getDataByCity: (city, callback) => {
            const promise = $.get({
                url: `/coronavirus/${city}`,
                type: 'GET',
                contentType: "application/json"
            }).then(response => {
                console.log(response);
                callback(response, null);
            }).catch(error => {
                callback(null, error);
            });
        }
    }
})();