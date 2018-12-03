package eu.noelvaes.housekeeping.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class GardeningServiceImpl {


    @Autowired
    private GardeningTool gardeningTool;


    public void setGardeningTool(GardeningTool gardeningTool) {

        this.gardeningTool = gardeningTool;
    }
}
