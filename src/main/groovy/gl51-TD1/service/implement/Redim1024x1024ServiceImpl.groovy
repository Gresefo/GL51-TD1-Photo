package gl51

import javax.inject.Inject

-TD1.service.implement

@Singleton
class Redim1024x1024ServiceImpl implements RedimService{

    @Inject
    PhotoService photoService

    @Inject
    MajDataBaseService dataBaseService

    @Inject
    FiligraneService filigraneService

    @Inject
    SauvegardeCloudService cloudService

    @Override
    void resize(Photo sourcePhoto){
        //
    }

    @Override
    void getAndResizeImage(){
        Photo photo = photoService.fetchPhoto();
        Photo newPhoto = resize(photo);
        filigraneService.applyLogo(newPhoto);
        cloudService.saveCloud(newPhoto);
        dataBaseService.updateDataBase(newPhoto.getX(), newPhoto.getY(), newPhoto.getName());
    }
}