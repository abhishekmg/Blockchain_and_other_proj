//dep

var express = require('express');
var app = express();
var bodyParser = require('body-parser');
var apiKey = '629fec4b7c9d80ade0f4faa7f88f4529';

//use
app.use(express.static('public'));
app.set('view engine', 'ejs');
app.use(bodyParser.urlencoded({extended: true}));


//routs
app.get('/', function(req, res){
    res.render('index');
});

app.post('/', function(req, res){
    res.render('index');
    console.log(req.body.city);
});

app.post('/', function (req, res) {
  let city = req.body.city;
  let url = `http://api.openweathermap.org/data/2.5/weather?q=${city}&units=imperial&appid=${apiKey}`

  request(url, function (err, response, body) {
    if(err){
      res.render('index', {weather: null, error: 'Error, please try again'});
    } else {
      let weather = JSON.parse(body)
      if(weather.main == undefined){
        res.render('index', {weather: null, error: 'Error, please try again'});
      } else {
        let weatherText = `It's ${weather.main.temp} degrees in ${weather.name}!`;
        res.render('index', {weather: weatherText, error: null});
      }
    }
  });
})

app.listen(3000);
console.log('running on 3000');
