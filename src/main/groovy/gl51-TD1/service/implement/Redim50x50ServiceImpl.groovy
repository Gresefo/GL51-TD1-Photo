package gl51

import gl51.RedimService

import javax.inject.Inject

-TD1.service.implement

@Singleton
class Redim50x50ServiceImpl implements RedimService{

    @Inject
    PhotoService photoService

    @Inject
    MajDataBaseService dataBaseService

    @Inject
    FiligraneService dataBaseService

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