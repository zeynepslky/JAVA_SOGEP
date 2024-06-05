package besmart;

public class DersYonetimi 
{

	void minimumOgrenciSayisiKontrol
	(int sinifMevcudu,
			int silinecekOgrenciSayisi)
					throws minimumOgrenciSayisi
	{
		if(sinifMevcudu-
				silinecekOgrenciSayisi<10)
			throw new 
			minimumOgrenciSayisi("Dersi alan "
					+ "öğrenci sayısı 10 dan "
					+ "az olamaz.");
	}
	
	void maksimumOgrenciSayisiKontrol
	(int sinifMevcudu, 
			int eklenecekOgrenciSayisi)
					throws maksimumOgrenciSayisi
	
	{
		if(sinifMevcudu+
				eklenecekOgrenciSayisi>40)
			throw new maksimumOgrenciSayisi(
					"Dersi alan öğrenci sayısı "
					+ "40 dan fazla olamaz.");
	}
}
