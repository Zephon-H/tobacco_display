package edu.ecnu.tobacco_display.controller;


import edu.ecnu.tobacco_display.model.entity.Station;
import edu.ecnu.tobacco_display.service.StationService;
import edu.ecnu.tobacco_display.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 设备管理接口
 *
 * @author TruthK
 */
@RestController
@RequestMapping("/station")
public class StationController {
    @Autowired
    private StationService stationService;


    @PostMapping("addStation")
    public JsonData addStation(@RequestBody Map<String, String> stationInfo) {
        int rows = stationService.saveStationInfo(stationInfo);
        return rows == 1 ? JsonData.buildSuccess() : JsonData.buildError("请确认输入无误");
    }

    @PostMapping("showStations")
    public JsonData showStations(@RequestBody Map<String, String> stationInfo) {
        List<Station> stations = stationService.findStationByOptions(stationInfo);
        return stations != null ? JsonData.buildSuccess(stations) : JsonData.buildError("请确认输入无误");
    }

    @PostMapping("alterStation")
    public JsonData alterStation(@RequestBody Map<String, String> stationInfo) {
        int rows = stationService.alterStationInfo(stationInfo);
        return rows == 1 ? JsonData.buildSuccess() : JsonData.buildError("请确认输入无误");
    }

    @PostMapping("deleteStation")
    public JsonData deleteStation(@RequestBody Map<String, String> stationInfo) {
        int rows = stationService.deleteStation(stationInfo);
        return rows == 1 ? JsonData.buildSuccess() : JsonData.buildError("请确认输入无误");
    }



}
