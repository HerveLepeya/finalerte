/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Structure
 * Classe Android : RapportPlainte
 * Date : 24/10/2021 18:20:32
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.finalerte.wdgen;


import com.masociete.finalerte.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.core.application.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



class GWDCRapportPlainte extends WDStructure
{
public WDObjet mWD_Civilite = new WDChaineU();
public WDObjet mWD_Noms = new WDChaineU();
public WDObjet mWD_Email = new WDChaineU();
public WDObjet mWD_Adresse = new WDChaineU();
public WDObjet mWD_Telephone = new WDChaineU();
public WDObjet mWD_TerritoireId = new WDEntier4();
public WDObjet mWD_ProvinceId = new WDChaineU();
public WDObjet mWD_MotifPlainte = new WDChaineU();
public WDObjet mWD_CoordonneeGPS_Altitude = new WDChaineU();
public WDObjet mWD_CoordonneeGPS_Latitude = new WDChaineU();
public WDObjet mWD_CoordonneeGPS_Longitude = new WDChaineU();
public WDObjet mWD_CoordonneeGPS_Precision = new WDChaineU();
public WDObjet mWD_NomAccuse = new WDChaineU();
public WDObjet mWD_TypeContenu = new WDChaineU();
public WDObjet mWD_PhoneId = new WDChaineU();
public WDObjet mWD_ServiceAccuse = new WDChaineU();
public WDObjet mWD_ProvinceAccuse = new WDChaineU();
public WDObjet mWD_LocalisationAccuse = new WDChaineU();
public WDObjet mWD_EntiteAccuse = new WDChaineU();



public GWDCRapportPlainte()
{
}

public WDProjet getProjet()
{
return GWDPTono_CF.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPTono_CF.getInstance();
}
public int getModeContexteHF()
{
return 1;
}
protected WDObjet getMembreByName(String sNomMembre)
{
if(sNomMembre.equals("civilite")) return mWD_Civilite;
if(sNomMembre.equals("noms")) return mWD_Noms;
if(sNomMembre.equals("email")) return mWD_Email;
if(sNomMembre.equals("adresse")) return mWD_Adresse;
if(sNomMembre.equals("telephone")) return mWD_Telephone;
if(sNomMembre.equals("territoireid")) return mWD_TerritoireId;
if(sNomMembre.equals("provinceid")) return mWD_ProvinceId;
if(sNomMembre.equals("motifplainte")) return mWD_MotifPlainte;
if(sNomMembre.equals("coordonneegps_altitude")) return mWD_CoordonneeGPS_Altitude;
if(sNomMembre.equals("coordonneegps_latitude")) return mWD_CoordonneeGPS_Latitude;
if(sNomMembre.equals("coordonneegps_longitude")) return mWD_CoordonneeGPS_Longitude;
if(sNomMembre.equals("coordonneegps_precision")) return mWD_CoordonneeGPS_Precision;
if(sNomMembre.equals("nomaccuse")) return mWD_NomAccuse;
if(sNomMembre.equals("typecontenu")) return mWD_TypeContenu;
if(sNomMembre.equals("phoneid")) return mWD_PhoneId;
if(sNomMembre.equals("serviceaccuse")) return mWD_ServiceAccuse;
if(sNomMembre.equals("provinceaccuse")) return mWD_ProvinceAccuse;
if(sNomMembre.equals("localisationaccuse")) return mWD_LocalisationAccuse;
if(sNomMembre.equals("entiteaccuse")) return mWD_EntiteAccuse;

return super.getMembreByName(sNomMembre);
}
protected boolean getMembreByIndex(int nIndice, WDClasse.Membre membre)
{
switch(nIndice)
{
case 0 : membre.m_refMembre = mWD_Civilite; membre.m_strNomMembre = "mWD_Civilite"; membre.m_bStatique = false; membre.m_strNomMembreWL = "Civilite"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 1 : membre.m_refMembre = mWD_Noms; membre.m_strNomMembre = "mWD_Noms"; membre.m_bStatique = false; membre.m_strNomMembreWL = "Noms"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 2 : membre.m_refMembre = mWD_Email; membre.m_strNomMembre = "mWD_Email"; membre.m_bStatique = false; membre.m_strNomMembreWL = "Email"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 3 : membre.m_refMembre = mWD_Adresse; membre.m_strNomMembre = "mWD_Adresse"; membre.m_bStatique = false; membre.m_strNomMembreWL = "Adresse"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 4 : membre.m_refMembre = mWD_Telephone; membre.m_strNomMembre = "mWD_Telephone"; membre.m_bStatique = false; membre.m_strNomMembreWL = "Telephone"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 5 : membre.m_refMembre = mWD_TerritoireId; membre.m_strNomMembre = "mWD_TerritoireId"; membre.m_bStatique = false; membre.m_strNomMembreWL = "TerritoireId"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 6 : membre.m_refMembre = mWD_ProvinceId; membre.m_strNomMembre = "mWD_ProvinceId"; membre.m_bStatique = false; membre.m_strNomMembreWL = "ProvinceId"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 7 : membre.m_refMembre = mWD_MotifPlainte; membre.m_strNomMembre = "mWD_MotifPlainte"; membre.m_bStatique = false; membre.m_strNomMembreWL = "MotifPlainte"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 8 : membre.m_refMembre = mWD_CoordonneeGPS_Altitude; membre.m_strNomMembre = "mWD_CoordonneeGPS_Altitude"; membre.m_bStatique = false; membre.m_strNomMembreWL = "CoordonneeGPS_Altitude"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 9 : membre.m_refMembre = mWD_CoordonneeGPS_Latitude; membre.m_strNomMembre = "mWD_CoordonneeGPS_Latitude"; membre.m_bStatique = false; membre.m_strNomMembreWL = "CoordonneeGPS_Latitude"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 10 : membre.m_refMembre = mWD_CoordonneeGPS_Longitude; membre.m_strNomMembre = "mWD_CoordonneeGPS_Longitude"; membre.m_bStatique = false; membre.m_strNomMembreWL = "CoordonneeGPS_Longitude"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 11 : membre.m_refMembre = mWD_CoordonneeGPS_Precision; membre.m_strNomMembre = "mWD_CoordonneeGPS_Precision"; membre.m_bStatique = false; membre.m_strNomMembreWL = "CoordonneeGPS_Precision"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 12 : membre.m_refMembre = mWD_NomAccuse; membre.m_strNomMembre = "mWD_NomAccuse"; membre.m_bStatique = false; membre.m_strNomMembreWL = "NomAccuse"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 13 : membre.m_refMembre = mWD_TypeContenu; membre.m_strNomMembre = "mWD_TypeContenu"; membre.m_bStatique = false; membre.m_strNomMembreWL = "TypeContenu"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 14 : membre.m_refMembre = mWD_PhoneId; membre.m_strNomMembre = "mWD_PhoneId"; membre.m_bStatique = false; membre.m_strNomMembreWL = "PhoneId"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 15 : membre.m_refMembre = mWD_ServiceAccuse; membre.m_strNomMembre = "mWD_ServiceAccuse"; membre.m_bStatique = false; membre.m_strNomMembreWL = "ServiceAccuse"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 16 : membre.m_refMembre = mWD_ProvinceAccuse; membre.m_strNomMembre = "mWD_ProvinceAccuse"; membre.m_bStatique = false; membre.m_strNomMembreWL = "ProvinceAccuse"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 17 : membre.m_refMembre = mWD_LocalisationAccuse; membre.m_strNomMembre = "mWD_LocalisationAccuse"; membre.m_bStatique = false; membre.m_strNomMembreWL = "LocalisationAccuse"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 18 : membre.m_refMembre = mWD_EntiteAccuse; membre.m_strNomMembre = "mWD_EntiteAccuse"; membre.m_bStatique = false; membre.m_strNomMembreWL = "EntiteAccuse"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;

default: return super.getMembreByIndex(nIndice - 19, membre);
}
}
protected WDPropriete getProprieteByName(String sNomPropriete)
{
return super.getProprieteByName(sNomPropriete);
}
protected WDPropriete getProprieteByIndex(int nIndice)
{
switch(nIndice)
{
default: return super.getProprieteByIndex(nIndice - 0);
}
}
}
