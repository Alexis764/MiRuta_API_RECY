USE miruta;

insert into bus (placa_bus) values 
('abc123'),
('jkl123'),
('dse312'),
('def456'),
('ghi789'),
('qwe213'),
('asd234'),
('fgh456'),
('vbn234'),
('bnm345'),
('tre543'),
('ljk876');

#insert into marcadores(id,nombre,latitud,longitud) values ();

insert into parada (id_paradas,nombre_para,direccion_para,latitud,longitud,img_parada) values 
(1,'PROSPERIDAD','Ciudadela La Prosperidad Cl 7 Madrid Cundinamarca',4.739177,-74.278175,'https://lh5.googleusercontent.com/p/AF1QipO1egW9Vd6HGQD6bE5wdBski-vi9LYDqMRiKALM=w475-h240-k-no'),
(2,'MARIA JOSE PARRILA','María José Parrilla, Cl. 7 #No. 0-99, Madrid, Cundinamarca','4.730178','-74.259490','https://lh5.googleusercontent.com/p/AF1QipMUx7tKuKvvsXhDwY5L4FHV5dlN--YmHKlUwgyc=w408-h240-k-no'), 
(3,'ECOPLAZA','Ecoplaza Centro Comercial, Cra. 3 #No. 15 A - 57, Mosquera, Cundinamarca','4.712083', '-74.221653','https://lh5.googleusercontent.com/p/AF1QipPXDj2V1fM4-a1jYc32BGnGmtZcdXe_W-Hdycms=w426-h240-k-no'),
(4,'CENTRO FUNZA','Funza Cundinamarca, a 13-109,, Cra. 13 #1315, Funza, Cundinamarca','4.716221','-74.211996','https://lh5.googleusercontent.com/p/AF1QipP5L196IqldBcUSrAwO-_m-ztf99mSo17ffYmgM=w408-h544-k-no'),
(5,'La pincha','Cl. 6 #14-97',4.734797, -74.270439,'https://streetviewpixels-pa.googleapis.com/v1/thumbnail?panoid=sLefkBPhAHocGW82RezOwA&cb_client=search.gws-prod.gps&w=408&h=240&yaw=127.60951&pitch=0&thumbfov=100'),
(6,'Casa Blanca','Cabellos Sanos Madrid, Cl. 7 # 0 - 99, Madrid, Cundinamarca',4.727424, -74.256419,'https://streetviewpixels-pa.googleapis.com/v1/thumbnail?panoid=E43_gXcYUAUztVstxwwGGQ&cb_client=search.gws-prod.gps&w=408&h=240&yaw=258.84018&pitch=0&thumbfov=100'),
(7,'TACTIKEM SAS', 'Parque industrial, Calle 2 #18-93 Bodega 49, Mosquera, Cundinamarca',4.714748, -74.241377,'https://streetviewpixels-pa.googleapis.com/v1/thumbnail?panoid=WRvvtL6H8g4ehGJfPrH9CQ&cb_client=search.gws-prod.gps&w=408&h=240&yaw=245.35408&pitch=0&thumbfov=100'),
(8,'Calle 3 parada','Flowserve Colombia SAS, Cra. 3 Este #10-82, Mosquera, Cundinamarca',4.710538, -74.236461,'https://lh3.googleusercontent.com/3uunFaby7c4-16_Szs-lhixiknK9Os74RzpG6MtPX83qlM0fWZsVlLoBrvNN0Xyr=w425-h240-k-no'),
(9,'Parque Principal Industrial','Politécnico Grancolombiano, Calle 2 # 4 - 45 Parque Principal Mosquera Interior I, Mosquera, Cundinamarca',4.705025, -74.230333,'https://lh5.googleusercontent.com/p/AF1QipMk4c-TZFkPhdeowLPwIDbaNkMyYp1bUueEXeWv=w408-h306-k-no'),
(10,'PAGATODO FA EL RUBI MOSQUERA',' Calle 17 No 5-13, Mosquera',4.707400, -74.218534,'https://streetviewpixels-pa.googleapis.com/v1/thumbnail?panoid=uoziCmmV7uxVGyn3hbfRYg&cb_client=search.gws-prod.gps&w=408&h=240&yaw=225.89075&pitch=0&thumbfov=100');

insert into ruta (id_ruta, lugar_inicio, lugar_final, hora_inicio, hora_final, marcador_ruta, dias_disponible) values 
(1,'Las palmas','Montanel','4:20:00','8:50:00','none','L/M/X/J/V'),
(2,'Las palmas','Rubí','4:20:00','8:50:00','none','L/J/V'),
(3,'Las palmas','Porvenir Río','4:20:00','8:50:00','none','X/J/V'),
(4,'Montanel','Parcelas','4:20:00','8:50:00','none','L'),
(5,'Montanel','Puentes','4:20:00','8:50:00','none','V'),
(6,'Montanel','Planadas','4:20:00','8:50:00','none','X/J/V'),
(7,'Rubí','Charquito','4:30:00','8:00:00','none','L/M/X/J/V'),
(8,'Rubí','Porvenir Río','4:30:00','8:00:00','none','L/M'),
(9,'Las palmas','Montanel','4:20:00','8:50:00','none','L/M/X/J/V'),
(10,'Las palmas','Montanel','4:20:00','8:50:00','none','L/M/X/J/V');

insert into usuario (correo_usu,contrasena_usu,nombre_usu,foto_usu) values 
('arturo@gmail.com','contraseña1','ArturoUsu','linkfoto'),
('alexis@gmail.com','contraseña2','alexisUsu','linkfoto'),
('Raul@gmail.com','contraseña3','RaulUsu','fotolink'),
('arnulfo@gmail.com','contraseña4','ArnulfoUsu','fotolink'),
('Juan@gmail.com','contraseña5','JuanUsu','fotolink'),
('Jesus@gmail.com','contraseña6','JesusUsu','fotolink'),
('MariaRaul@gmail.com','contraseña7','MariaUsu','fotolink'),
('Alquimides@gmail.com','contraseña8','AlquimidesUsu','fotolink'),
('Edgar@gmail.com','contraseña9','EdgarUsu','fotolink'),
('Jose@gmail.com','contraseña10','JoseUsu','fotolink');


#insert into usuario_has_rutas (Usuario_Correo_Usu, Rutas_idRuta) values ('arturo@gmail.com', 6),('arturo@gmail.com', 3),('arturo@gmail.com', 2);


select * from miruta.buses;
select * from miruta.paradas;
select * from miruta.rutas;
select * from miruta.usuario;
SELECT * FROM miruta.usuario_has_rutas;



USE miruta;
#select * from rutas Left join usuario_has_rutas on (idRuta = Rutas_idRuta); 
#select * from rutas inner join usuario_has_rutas on (idRuta = Rutas_idRuta) where Usuario_Correo_Usu = "alexis@gmail.com";