from firebase import firebase

#Conexion con firebase
firebase = firebase.FirebaseApplication("https://proyecto1-39977-default-rtdb.firebaseio.com/",None)

#Datos a enviar a la BD
datos ={
    'id':'3',
    'nombre':'Melissa',
    'apellido':'Montoya'
}

#Llenar la base de datos con el Método Post
resultado = firebase.post("/tutorial/datos_post",datos)

