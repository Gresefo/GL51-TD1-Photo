package gl51

import gl51.SauvegardeCloudService

import javax.inject.Inject

-TD1.service.implement

class SauvegardeCloudServiceImpl implements SauvegardeCloudService{

    @Inject
    PhotoService photoService

    @Override
    void sauvegardeCloud(){

    }
}