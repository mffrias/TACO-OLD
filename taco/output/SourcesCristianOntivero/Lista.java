package SourcesCristianOntivero;

//@ model import org.jmlspecs.lang.*;


public class Lista extends java.lang.Object {

  public int SourcesCristianOntivero_Lista_NumElementos;
  public /*@ nullable @*/ SourcesCristianOntivero.Nodo SourcesCristianOntivero_Lista_Primero;
  public /*@ nullable @*/ SourcesCristianOntivero.Nodo SourcesCristianOntivero_Lista_Ultimo;
  /*@ invariant (\forall SourcesCristianOntivero.Nodo n; \reach(this.SourcesCristianOntivero_Lista_Primero, SourcesCristianOntivero.Nodo, SourcesCristianOntivero_Nodo_Siguiente).has(((java.lang.Object)(n)))  ==  true; \reach(n.SourcesCristianOntivero_Nodo_Siguiente, SourcesCristianOntivero.Nodo, SourcesCristianOntivero_Nodo_Siguiente).has(((java.lang.Object)(n)))  ==  false);
    @*/
  /*@ invariant (this.SourcesCristianOntivero_Lista_Primero  ==  null && this.SourcesCristianOntivero_Lista_Ultimo  ==  null) || (\reach(this.SourcesCristianOntivero_Lista_Primero, SourcesCristianOntivero.Nodo, SourcesCristianOntivero_Nodo_Siguiente).has(((java.lang.Object)(this.SourcesCristianOntivero_Lista_Ultimo)))  ==  true && this.SourcesCristianOntivero_Lista_Ultimo.SourcesCristianOntivero_Nodo_Siguiente  ==  null);
    @*/
  /*@ invariant this.SourcesCristianOntivero_Lista_NumElementos  ==  \reach(this.SourcesCristianOntivero_Lista_Primero, SourcesCristianOntivero.Nodo, SourcesCristianOntivero_Nodo_Siguiente).int_size();
    @*/

  public boolean EsVacio() {
    {
      boolean t_1;

      t_1 = this.SourcesCristianOntivero_Lista_NumElementos  ==  0;
      if (t_1) {
        {
          {
            {
              {
                {
                  return true;
                }
              }
            }
          }
        }
      } else {
        {
          {
            {
              {
                {
                  return false;
                }
              }
            }
          }
        }
      }
    }
  }


  public Lista() {
    this.SourcesCristianOntivero_Lista_NumElementos = 0;
    this.SourcesCristianOntivero_Lista_Primero = ((SourcesCristianOntivero.Nodo)(null));
    this.SourcesCristianOntivero_Lista_Ultimo = ((SourcesCristianOntivero.Nodo)(null));
    {
      this.SourcesCristianOntivero_Lista_NumElementos = 0;
      this.SourcesCristianOntivero_Lista_Primero = ((SourcesCristianOntivero.Nodo)(null));
      this.SourcesCristianOntivero_Lista_Ultimo = ((SourcesCristianOntivero.Nodo)(null));
    }
  }


  public Lista(int Datos, SourcesCristianOntivero.Nodo primero, SourcesCristianOntivero.Nodo ultimo) {
    this.SourcesCristianOntivero_Lista_NumElementos = 0;
    this.SourcesCristianOntivero_Lista_Primero = ((SourcesCristianOntivero.Nodo)(null));
    this.SourcesCristianOntivero_Lista_Ultimo = ((SourcesCristianOntivero.Nodo)(null));
    {
    }
  }


  /*@ 
    @ requires true;
    @ ensures (\exists SourcesCristianOntivero.Nodo n; \reach(this.SourcesCristianOntivero_Lista_Primero, SourcesCristianOntivero.Nodo, SourcesCristianOntivero_Nodo_Siguiente).has(((java.lang.Object)(n))); n.SourcesCristianOntivero_Nodo_Dato  ==  Dato && n.SourcesCristianOntivero_Nodo_Siguiente  ==  null);
    @*/
  public void AgregarNodo(int Dato) {
    int param_Dato_0;

    param_Dato_0 = Dato;
    {
      try {
        SourcesCristianOntivero.Nodo t_2;
        boolean t_3;
        boolean t_4;
        int t_5;

        t_2 = new SourcesCristianOntivero.Nodo(param_Dato_0);
        SourcesCristianOntivero.Nodo var_1_Nuevo = t_2;

        t_3 = this.EsVacio();
        t_4 = t_3  ==  true;

        if (t_4) {
          {
            {
              {
                {
                  {
                    this.SourcesCristianOntivero_Lista_Primero = var_1_Nuevo;
                    this.SourcesCristianOntivero_Lista_Ultimo = var_1_Nuevo;
                  }
                }
              }
            }
          }
        } else {
          {
            {
              {
                {
                  {
                    this.SourcesCristianOntivero_Lista_Ultimo.SourcesCristianOntivero_Nodo_Siguiente = var_1_Nuevo;
                    this.SourcesCristianOntivero_Lista_Ultimo = var_1_Nuevo;
                  }
                }
              }
            }
          }
        }
        t_5 = this.SourcesCristianOntivero_Lista_NumElementos;
        this.SourcesCristianOntivero_Lista_NumElementos = this.SourcesCristianOntivero_Lista_NumElementos + (byte)1;
      } catch (java.lang.Exception Ex) {
      }
    }
  }


  public int ObtenerIndiceNodo(int Dato) {
    int param_Dato_1;

    param_Dato_1 = Dato;
    {
      try {
        boolean t_8;
        boolean t_9;

        t_8 = this.EsVacio();
        t_9 = t_8  !=  true;
        if (t_9) {
          {
            {
              {
                {
                  {
                    SourcesCristianOntivero.Nodo var_2_Temp = this.SourcesCristianOntivero_Lista_Primero;
                    int var_3_dat = -1;
                    int var_4_contador = 1;
                    boolean var_5_ws_1;

                    var_5_ws_1 = var_2_Temp  !=  null;
                    while (var_5_ws_1) {
                      boolean t_6;
                      int t_7;

                      var_3_dat = var_2_Temp.SourcesCristianOntivero_Nodo_Dato;
                      t_6 = var_3_dat  ==  param_Dato_1;

                      if (t_6) {
                        {
                          {
                            {
                              {
                                {
                                  return var_4_contador;
                                }
                              }
                            }
                          }
                        }
                      }
                      t_7 = var_4_contador;
                      var_4_contador = var_4_contador + (byte)1;
                      var_2_Temp = var_2_Temp.SourcesCristianOntivero_Nodo_Siguiente;
                      var_5_ws_1 = var_2_Temp  !=  null;
                    }

                    return -1;
                  }
                }
              }
            }
          }
        } else {
          {
            {
              {
                {
                  {
                    return -1;
                  }
                }
              }
            }
          }
        }
      } catch (java.lang.Exception Ex) {
        return -1;
      }
    }
  }


  public SourcesCristianOntivero.Nodo ObtenerNodoPorDato(int Dato) {
    int param_Dato_2;

    param_Dato_2 = Dato;
    {
      try {
        boolean t_12;
        boolean t_13;

        t_12 = this.EsVacio();
        t_13 = t_12  !=  true;
        if (t_13) {
          {
            {
              {
                {
                  {
                    SourcesCristianOntivero.Nodo var_6_Temp = this.SourcesCristianOntivero_Lista_Primero;
                    int var_7_dat = -1;
                    int var_8_contador = 1;
                    boolean var_9_ws_2;

                    var_9_ws_2 = var_6_Temp  !=  null;
                    while (var_9_ws_2) {
                      boolean t_10;
                      int t_11;

                      var_7_dat = var_6_Temp.SourcesCristianOntivero_Nodo_Dato;
                      t_10 = var_7_dat  ==  param_Dato_2;

                      if (t_10) {
                        {
                          {
                            {
                              {
                                {
                                  return var_6_Temp;
                                }
                              }
                            }
                          }
                        }
                      }
                      t_11 = var_8_contador;
                      var_8_contador = var_8_contador + (byte)1;
                      var_6_Temp = var_6_Temp.SourcesCristianOntivero_Nodo_Siguiente;
                      var_9_ws_2 = var_6_Temp  !=  null;
                    }

                    return ((SourcesCristianOntivero.Nodo)(null));
                  }
                }
              }
            }
          }
        } else {
          {
            {
              {
                {
                  {
                    return ((SourcesCristianOntivero.Nodo)(null));
                  }
                }
              }
            }
          }
        }
      } catch (java.lang.Exception Ex) {
        return ((SourcesCristianOntivero.Nodo)(null));
      }
    }
  }


  public SourcesCristianOntivero.Nodo ObtenerNodoPorIndice(int posicion) {
    int param_posicion_3;

    param_posicion_3 = posicion;
    {
      try {
        boolean t_15;
        boolean t_16;

        t_15 = this.EsVacio();
        t_16 = t_15  !=  true;
        if (t_16) {
          {
            {
              {
                {
                  {
                    SourcesCristianOntivero.Nodo var_10_Temp = this.SourcesCristianOntivero_Lista_Primero;

                    {
                      int var_11_i = 1;
                      boolean var_12_ws_3;

                      var_12_ws_3 = var_11_i  <  param_posicion_3;
                      while (var_12_ws_3) {
                        int t_14;

                        var_10_Temp = var_10_Temp.SourcesCristianOntivero_Nodo_Siguiente;
                        t_14 = var_11_i;
                        var_11_i = var_11_i + (byte)1;
                        var_12_ws_3 = var_11_i  <  param_posicion_3;
                      }
                    }

                    return var_10_Temp;
                  }
                }
              }
            }
          }
        } else {
          {
            {
              {
                {
                  {
                    return ((SourcesCristianOntivero.Nodo)(null));
                  }
                }
              }
            }
          }
        }
      } catch (java.lang.Exception Ex) {
        return ((SourcesCristianOntivero.Nodo)(null));
      }
    }
  }


  /*@ 
    @ requires true;
    @ ensures (\exists SourcesCristianOntivero.Nodo n; true; (\old(\reach(this.SourcesCristianOntivero_Lista_Primero, SourcesCristianOntivero.Nodo, SourcesCristianOntivero_Nodo_Siguiente)).has(((java.lang.Object)(n))) && n.SourcesCristianOntivero_Nodo_Dato  ==  dato) ==> (\reach(this.SourcesCristianOntivero_Lista_Primero, SourcesCristianOntivero.Nodo, SourcesCristianOntivero_Nodo_Siguiente).has(((java.lang.Object)(n)))  ==  false && (\forall SourcesCristianOntivero.Nodo m; \old(\reach(this.SourcesCristianOntivero_Lista_Primero, SourcesCristianOntivero.Nodo, SourcesCristianOntivero_Nodo_Siguiente)).has(((java.lang.Object)(m))) && m  !=  n; \reach(this.SourcesCristianOntivero_Lista_Primero, SourcesCristianOntivero.Nodo, SourcesCristianOntivero_Nodo_Siguiente).has(((java.lang.Object)(m))))));
    @*/
  public boolean EliminarNodo(int dato) {
    int param_dato_4;

    param_dato_4 = dato;
    {
      boolean t_32;
      boolean t_33;

      t_32 = this.EsVacio();
      t_33 = t_32  !=  true;
      if (t_33) {
        {
          {
            {
              {
                {
                  int t_17;
                  boolean t_28;
                  boolean t_29;
                  boolean t_30;
                  int t_31;

                  t_17 = this.ObtenerIndiceNodo(param_dato_4);
                  int var_13_pos = t_17;

                  t_29 = var_13_pos  ==  1;

                  if (t_29) {
                    {
                      {
                        t_30 = this.SourcesCristianOntivero_Lista_NumElementos  ==  1;
                        if (t_30) {
                          {
                            t_28 = true;
                          }
                        } else {
                          {
                            t_28 = false;
                          }
                        }
                      }
                    }
                  } else {
                    {
                      t_28 = false;
                    }
                  }

                  if (t_28) {
                    {
                      {
                        {
                          {
                            {
                              this.SourcesCristianOntivero_Lista_Primero = ((SourcesCristianOntivero.Nodo)(null));
                              this.SourcesCristianOntivero_Lista_Ultimo = ((SourcesCristianOntivero.Nodo)(null));
                            }
                          }
                        }
                      }
                    }
                  } else {
                    {
                      {
                        {
                          {
                            {
                              boolean t_25;
                              boolean t_26;
                              boolean t_27;

                              t_26 = var_13_pos  ==  1;

                              if (t_26) {
                                {
                                  {
                                    t_27 = this.SourcesCristianOntivero_Lista_NumElementos  >  1;
                                    if (t_27) {
                                      {
                                        t_25 = true;
                                      }
                                    } else {
                                      {
                                        t_25 = false;
                                      }
                                    }
                                  }
                                }
                              } else {
                                {
                                  t_25 = false;
                                }
                              }
                              if (t_25) {
                                {
                                  {
                                    {
                                      {
                                        {
                                          SourcesCristianOntivero.Nodo var_14_Temp = this.SourcesCristianOntivero_Lista_Primero.SourcesCristianOntivero_Nodo_Siguiente;

                                          this.SourcesCristianOntivero_Lista_Primero.SourcesCristianOntivero_Nodo_Siguiente = ((SourcesCristianOntivero.Nodo)(null));
                                          this.SourcesCristianOntivero_Lista_Primero = var_14_Temp;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                {
                                  {
                                    {
                                      {
                                        {
                                          boolean t_22;
                                          boolean t_23;
                                          boolean t_24;

                                          t_23 = var_13_pos  >  1;

                                          if (t_23) {
                                            {
                                              {
                                                t_24 = var_13_pos  ==  this.SourcesCristianOntivero_Lista_NumElementos;
                                                if (t_24) {
                                                  {
                                                    t_22 = true;
                                                  }
                                                } else {
                                                  {
                                                    t_22 = false;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            {
                                              t_22 = false;
                                            }
                                          }
                                          if (t_22) {
                                            {
                                              {
                                                {
                                                  {
                                                    {
                                                      int t_18;
                                                      SourcesCristianOntivero.Nodo t_19;

                                                      t_18 = var_13_pos - 1;
                                                      t_19 = this.ObtenerNodoPorIndice(t_18);
                                                      SourcesCristianOntivero.Nodo var_15_Temp = t_19;

                                                      var_15_Temp.SourcesCristianOntivero_Nodo_Siguiente = ((SourcesCristianOntivero.Nodo)(null));
                                                      this.SourcesCristianOntivero_Lista_Ultimo = var_15_Temp;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            {
                                              {
                                                {
                                                  {
                                                    {
                                                      int t_20;
                                                      SourcesCristianOntivero.Nodo t_21;

                                                      t_20 = var_13_pos - 1;
                                                      t_21 = this.ObtenerNodoPorIndice(t_20);
                                                      SourcesCristianOntivero.Nodo var_16_Temp = t_21;
                                                      SourcesCristianOntivero.Nodo var_17_Aux = var_16_Temp.SourcesCristianOntivero_Nodo_Siguiente;

                                                      var_16_Temp.SourcesCristianOntivero_Nodo_Siguiente = var_17_Aux.SourcesCristianOntivero_Nodo_Siguiente;
                                                      var_17_Aux.SourcesCristianOntivero_Nodo_Siguiente = ((SourcesCristianOntivero.Nodo)(null));
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  t_31 = this.SourcesCristianOntivero_Lista_NumElementos;
                  this.SourcesCristianOntivero_Lista_NumElementos = this.SourcesCristianOntivero_Lista_NumElementos + (byte)-1;

                  return true;
                }
              }
            }
          }
        }
      } else {
        {
          {
            {
              {
                {
                  return false;
                }
              }
            }
          }
        }
      }
    }
  }


  /*@ 
    @ requires true;
    @ ensures (\exists SourcesCristianOntivero.Nodo n; true; n.SourcesCristianOntivero_Nodo_Dato  ==  Dato ==> \result  ==  true);
    @*/
  public boolean Existe(int Dato) {
    int param_Dato_5;

    param_Dato_5 = Dato;
    {
      try {
        boolean t_35;
        boolean t_36;

        t_35 = this.EsVacio();
        t_36 = t_35  !=  true;
        if (t_36) {
          {
            {
              {
                {
                  {
                    SourcesCristianOntivero.Nodo var_18_Temp = this.SourcesCristianOntivero_Lista_Primero;
                    int var_19_dat = -1;
                    boolean var_20_ws_4;

                    var_20_ws_4 = var_18_Temp  !=  null;
                    while (var_20_ws_4) {
                      boolean t_34;

                      var_19_dat = var_18_Temp.SourcesCristianOntivero_Nodo_Dato;
                      t_34 = var_19_dat  ==  param_Dato_5;

                      if (t_34) {
                        {
                          {
                            {
                              {
                                {
                                  return true;
                                }
                              }
                            }
                          }
                        }
                      }
                      var_18_Temp = var_18_Temp.SourcesCristianOntivero_Nodo_Siguiente;
                      var_20_ws_4 = var_18_Temp  !=  null;
                    }

                    return false;
                  }
                }
              }
            }
          }
        } else {
          {
            {
              {
                {
                  {
                    return false;
                  }
                }
              }
            }
          }
        }
      } catch (java.lang.Exception Ex) {
        return false;
      }
    }
  }

}
