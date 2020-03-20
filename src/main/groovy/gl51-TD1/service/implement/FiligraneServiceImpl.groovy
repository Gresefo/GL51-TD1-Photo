package gl51

import gl51.FiligraneService

import javax.inject.Inject

-TD1.service.implement

class FiligraneServiceImpl implements FiligraneService{

    @Inject
    PhotoService photoService

    @Override
    void getEtFiligrane(){

    }
}