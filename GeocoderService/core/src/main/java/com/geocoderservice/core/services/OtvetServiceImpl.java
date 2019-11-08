package com.geocoderservice.core.services;

import com.geocoderservice.core.model.Otvet;
import com.geocoderservice.core.repositories.OtvetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.common.collect.Maps;

@Service
@RequiredArgsConstructor
//Geocoder
public class OtvetServiceImpl implements OtvetService extends AbstractSample {
    public static void main(final String[] args) throws IOException, JSONException {
        final String baseUrl = "https://maps.googleapis.com/maps/api/geocode/json?key=AIzaSyAeaUSU-awyf8b3x14tX9luIUkueFGBBJg&";
        final Map<String, String> params = Maps.newHashMap();
        params.put("sensor", "false");
        params.put("address", "Россия, Москва, улица Поклонная, 12");
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


    private OtvetRepository otvetRepository;


    @Override
    public Otvet getOtvet(Long id) {
        return otvetRepository.findById(id).get();
    
}
