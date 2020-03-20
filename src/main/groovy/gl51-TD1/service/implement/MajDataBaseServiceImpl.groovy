package gl51

import gl51.MajDataBaseService

import javax.inject.Inject

-TD1.service.implement

class MajDataBaseServiceImpl implements MajDataBaseService{

    @Inject
    PhotoService photoService

    @Override
    void majDataBase(){
    }
}

