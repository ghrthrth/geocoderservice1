
//package model
{
@Getter
@Setter
@Entity
@Table(name="Responce")
@NoArgsConstructor 
@AllArgsConstructor
Public class Respoce{
@Id
Private Long Id;
Private String adress;
Private String coordinates;
} 


//Repository
Import model(лень писать полностью)//это главный импорт тут, остальное и так понятно
@Repository
Piblic interface ResponceRepository extends CrudRepository <Responce, Long>{
Responce get.ById(adress);
} 
    


//
Controller
//service
Responce getResponce(adress);
@Service
@RequiredArgsConstructor 

Private final ResponceRepository responceRepository;

@Override 
Public Responce get.Responce(adress) {
return responceRepository.findById(adress);

        String baseUrl = "https://maps.googleapis.com/maps/api/geocode/json?key=AIzaSyAeaUSU-awyf8b3x14tX9luIUkueFGBBJg&";
        final Map<String, String> params = Maps.newHashMap();
        params.put("sensor", "false");
        params.put("address", "adress");
        final String url = baseUrl + encodeParams(params);
        System.out.println(url);
        final JSONObject response = JsonReader.read(url);

        JSONObject location = response.getJSONArray("results").getJSONObject(0);
        location = location.getJSONObject("geometry");
        location = location.getJSONObject("location");
        final double lng = location.getDouble("lng");
        final double lat = location.getDouble("lat");
        System.out.println(String.format("%f,%f", lat, lng));
    }
}





} 
//controllers
    @PostMapping("/Responce/{adress}") 

    Public Reponce sayAdress(@PathVariable Long adress) {
return responceService.getReponce(adress);
                ));
    }
}

//личные пометки
Принимаем даннве, обрабатываем, обрашаемся к репозиторию
Билд ответа, возврат ответа
Service-
