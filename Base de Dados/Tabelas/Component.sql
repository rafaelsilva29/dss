-- Component

-- idComponent(default)
-- Name (String)
-- Price (double)
-- Quantity (int)
-- Description (String)
-- Type (int)
-- Compatibility(String)


-- 1->jantes - check -> main
-- 2->motor - check  -> main
-- 3->radio - check -> main
-- 4->bancos - check -> main
-- 5->GPS - check
-- 6->sensores - check (Parking camera)
-- 7->suspensao -> main
-- 8->tinta - check -> main
-- 9->colunas - check
-- 10->luzes - check
-- 11->window - check
-- 12 -> volantes - check -> main
-- 13 -> sliding roof - check
-- 14 -> Back seats screen - check
-- 15 -> tapetes - check

-- Default Rims for packs

Insert into component (idComponent, Name, Price, Quantity, Description, Type, Compatibility)

VALUES

(default, "BBS Super RS", 500.00, 10, "17'", 1, "BMW"),
(default, "BBS FL", 450.00, 10, "16'", 1, "Mini"),
(default, "BBS SV", 700.00, 10, "19'", 1, "RollsRoyce"),
(default, "BSS GS", 600.00, 10, "14'", 1, "BMW"),
(default, "BSS GT", 900.00, 10, "20'", 1, "Mini"),
(default, "BSS HH", 675.00, 10, "13'", 1, "RollsRoyce"),
(default, "BSS GS2", 659.00, 10, "14'", 1, "BMW"),
(default, "BSS GTT", 1900.00, 10, "20'", 1, "Mini"),
(default, "BSS HHUltra", 675.00, 10, "15'", 1, "RollsRoyce"),
(default, "BSS GSuper", 640.00, 10, "14'", 1, "BMW"),
(default, "BSS GTuga", 3000.00, 10, "19'", 1, "Mini"),
(default, "BSS HOH", 570.00, 10, "12'", 1, "RollsRoyce"),
(default, "BSS RH", 565.00, 10, "14'", 1, "RollsRoyce"),
(default, "BSS RHR", 670.00, 10, "11'", 1, "RollsRoyce"),
(default, "BSS RoHaR", 1070.00, 10, "22'", 1, "BMW"),


(default, "3500cc petrol", 3700.00, 10, "Turbo, 350HP", 2, "BMW"),
(default, "1600cc diesel", 1600.00, 10, "Turbo, 110", 2, "Mini"),
(default, "5000cc petrol", 7000.00, 10, "Turbo, 500HP", 2, "RollsRoyce"),
(default, "200cc petrol", 2000.00, 10, "Turbo, 50HP", 2, "BMW"),
(default, "2000cc petrol", 4099.00, 10, "Turbo, 350", 2, "Mini"),
(default, "3500cc petrol", 2700.00, 10, "Turbo, 720HP", 2, "RollsRoyce"),
(default, "230cc petrol", 2300.00, 10, "Turbo, 50PP", 2, "BMW"),
(default, "2000cc diesel", 4500.00, 10, "Turbo, 350L", 2, "Mini"),
(default, "3500cc petrol", 2500.00, 10, "Turbo, 420HP", 2, "RollsRoyce"),
(default, "3500cc diesel", 3300.00, 10, "Turbo, 500HP2", 2, "BMW"),
(default, "400cc diesel", 7000.00, 10, "Turbo, 3003", 2, "Mini"),
(default, "2700cc diesel", 2300.00, 10, "Turbo, 750HP", 2, "RollsRoyce"),



(default, "Pioneer FH", 200.00, 10, "LCD, Bluetooth", 3, "BMW"),
(default, "Pioneer DEH", 100.00, 10, "Bluetooth", 3, "Mini"),
(default, "Pioneer SPH", 500.00, 10, "LCD, CarPlay, Bluetooth", 3, "RollsRoyce"),
(default, "Pioneer FuHma", 230.00, 10, "Bluetooth", 3, "BMW"),
(default, "Pioneer SPDV1", 300.00, 10, "Bluetooth", 3, "Mini"),
(default, "Pioneer HLO", 250.00, 10, "Bluetooth", 3, "RollsRoyce"),
(default, "Pioneer FuHV2", 330.00, 10, "LCD, Bluetooth", 3, "BMW"),
(default, "Pioneer SPDNV2", 400.00, 10, "LCD, Bluetooth", 3, "Mini"),
(default, "Pioneer HLO2", 350.00, 10, "LCD, Bluetooth", 3, "RollsRoyce"),
(default, "Pioneer FuHV3", 430.00, 10, "LCD, CarPlay, Bluetooth", 3, "BMW"),
(default, "Pioneer SPaDa", 500.00, 10, "LCD, CarPlay, Bluetooth", 3, "Mini"),
(default, "Pioneer HiLO2", 450.00, 10, "LCD, CarPlay, Bluetooth", 3, "RollsRoyce"),

(default, "Comfort Seats", 600.00, 10, "Leather with red stitching", 4, "BMW"),
(default, "Casual Seats", 500.00, 10, "Fabric with grey stitching", 4, "BMW"),
(default, "Economic Seats", 250.00, 10, "Fabric with grey stitching", 4, "BMW"),
(default, "Sport Seats", 500.00, 10, "Fabric with grey stitching", 4, "BMW"),
(default, "Luxury Seats", 800.00, 10, "Alcantara with handmade white stitching", 4, "BMW"),
(default, "Comfort Seats", 650.00, 10, "Leather with red stitching", 4, "Mini"),
(default, "Casual Seats", 550.00, 10, "Fabric with grey stitching", 4, "Mini"),
(default, "Economic Seats", 250.00, 10, "Fabric with grey stitching", 4, "Mini"),
(default, "Sport Seats", 500.00, 10, "Fabric with grey stitching", 4, "Mini"),
(default, "Luxury Seats", 900.00, 10, "Alcantara with handmade yellow stitching", 4, "Mini"),
(default, "Racing Seats", 800.00, 10, "Alcantara with handmade yellow stitching and driving confort", 4, "Mini"),
(default, "Movie Seats", 1000.00, 10, "Casual seats with ejection pack instaled", 4, "Mini"),
(default, "Comfort Seats", 500.00, 10, "Leather with red stitching", 4, "RollsRoyce"),
(default, "Casual Seats", 400.00, 10, "Fabric with grey stitching", 4, "RollsRoyce"),
(default, "Economic Seats", 250.00, 10, "Fabric with grey stitching", 4, "RoolsRoyce"),
(default, "Sport Seats", 700.00, 10, "Fabric with grey stitching", 4, "RoolsRoyce"),
(default, "Luxury Seats", 1500.00, 10, "Alcantara with handmade white stitching", 4, "RollsRoyce"),
(default, "Luxury Premium Edition Seats", 2500.00, 10, "Alcantara with handmade gold stitching", 4, "RollsRoyce"),


(default, "Garmin zumo", 400.00, 10, "10m accuracy", 5, "BMW"),
(default, "Garmin drive 51", 200.00, 10, "20m accuracy", 5, "Mini"),
(default, "Garmin GPSMAP", 700.00, 10, "2m accuracy", 5, "RollsRoyce"),
(default, "Garmin zumo BMW Edition", 420.00, 10, "10m accuracy", 5, "BMW"),
(default, "RoadHelper 200", 250.00, 10, "20m accuracy", 5, "BMW"),
(default, "Garmin T233", 100, 10, "2m accuracy", 5, "BMW"),
(default, "Garmin zumo Mini Edition", 450.00, 10, "10m accuracy", 5, "Mini"),
(default, "Nuevo Camino", 300.00, 10, "20m accuracy", 5, "Mini"),
(default, "Mini Motorsport GPS", 900.00, 10, "2m accuracy", 5, "Mini"),
(default, "Garmin zumo RollsRoyce Edition", 410.00, 10, "10m accuracy", 5, "RollsRoyce"),
(default, "Mountain track 03", 150.00, 10, "20m accuracy", 5, "RollsRoyce"),
(default, "TomTom Roadmap", 600.00, 10, "2m accuracy", 5, "RollsRoyce"),
(default, "China Wonder", 100.00, 10, "50m accuracy", 5, "RollsRoyce"),


(default, "360 degree Sensors", 400.00, 10, "Sensors around all car", 6, "BMW"),
(default, "Back Sensors", 200.00, 10, "Sensors on the rear part of the car", 6, "BMW"),
(default, "Full Sensors", 1000.00, 10, "Sensors and cameras around all car ", 6, "BMW"),
(default, "360 degree Sensors", 430.00, 10, "Sensors around all car", 6, "Mini"),
(default, "Back Sensors", 200.00, 10, "Sensors on the rear part of the car", 6, "Mini"),
(default, "Full Sensors", 1200.00, 10, "Sensors and cameras around all car ", 6, "Mini"),
(default, "360 degree Sensors", 399.99, 10, "Sensors around all car", 6, "RollsRoyce"),
(default, "Back Sensors", 200.00, 10, "Sensors on the rear part of the car", 6, "RollsRoyce"),
(default, "Full Sensors", 1000.00, 10, "Sensors and cameras around all car ", 6, "RollsRoyce"),

(default, "Sport Suspension", 1500.00, 10, "Stiff suspension for better handling", 7, "BMW"),
(default, "Comfort Suspension", 1000.00, 10, "Soft suspension to smooth your ride", 7, "BMW"),
(default, "Economic Suspension", 700.00, 10, "Soft suspension to smooth your ride", 7, "BMW"),
(default, "Moon Suspension", 1500.00, 10, "Soft suspension with hidraulic system", 7, "BMW"),
(default, "Sport Suspension", 1500.00, 10, "Stiff suspension for better handling", 7, "Mini"),
(default, "Comfort Suspension", 1000.00, 10, "Soft suspension to smooth your ride", 7, "Mini"),
(default, "Economic Suspension", 700.00, 10, "Soft suspension to smooth your ride", 7, "Mini"),
(default, "Moon Suspension", 1500.00, 10, "Soft suspension with hidraulic system", 7, "Mini"),
(default, "Sport Suspension", 1700.00, 10, "Stiff suspension for better handling", 7, "RollsRoyce"),
(default, "Economic Suspension", 1000.00, 10, "Soft suspension to smooth your ride", 7, "RollsRoyce"),
(default, "Comfort Suspension", 1500.00, 10, "Soft suspension to smooth your ride", 7, "RollsRoyce"),
(default, "Moon Suspension", 2500.00, 10, "Soft suspension with hidraulic system", 7, "RollsRoyce"),
(default, "Dakar Suspension", 1300.00, 10, "Stiff suspensionadaptable to the environment", 7, "RollsRoyce"),
(default, "Cheap Suspension", 1500.00, 10, "suspension indicated for older models", 7, "RollsRoyce"),


(default, "Sideral Black", 1200.00, 10, "Glossy finish", 8, "BMW"),
(default, "Red and white", 1000.00, 10, "Glossy finish", 8, "BMW"),
(default, "Gold", 2000.00, 10, "Glossy finish", 8, "BMW"),
(default, "Coper", 1500.00, 10, "Glossy finish", 8, "BMW"),
(default, "Arcade Green", 600.00, 10, "Retro style", 8, "BMW"),
(default, "Executive Silver", 1700.00, 10, "Luxury finish", 8, "BMW"),
(default, "Black", 1700.00, 10, "Luxury finish", 8, "BMW"),


(default, "Sideral Black", 1300.00, 10, "Glossy finish", 8, "Mini"),
(default, "Imperial Purple", 1600.00, 10, "Glossy finish", 8, "Mini"),
(default, "Dark Red", 1100.00, 10, "Glossy finish", 8, "Mini"),
(default, "Brown", 1200.00, 10, "Matte finish", 8, "Mini"),
(default, "Dark Green", 1200.00, 10, "Glossy finish", 8, "Mini"),
(default, "Red and white", 700.00, 10, "Retro style", 8, "Mini"),
(default, "Orange and Black", 700.00, 10, "Retro style", 8, "Mini"),
(default, "Arcade Green", 600.00, 10, "Retro style", 8, "Mini"),
(default, "Executive Silver", 1700.00, 10, "Luxury finish", 8, "Mini"),
(default, "Black", 1700.00, 10, "Luxury finish", 8, "Mini"),

(default, "Sideral Black", 1200.00, 10, "Glossy finish", 8, "RollsRoyce"),
(default, "Red adn white", 700.00, 10, "Retro style", 8, "RollsRoyce"),
(default, "Executive Silver", 1700.00, 10, "Luxury finish", 8, "RollsRoyce"),
(default, "LGBT Pride", 6969.00, 10, "Luxury finish, with velvet aplications", 8, "RollsRoyce"),
(default, "Executive Silver", 1700.00, 10, "Luxury finish", 8, "RollsRoyce"),
(default, "Black", 1700.00, 10, "Luxury finish", 8, "RollsRoyce"),


(default, "Bose Hi-Fi", 700.00, 10, "High fidelity audio", 9, "BMW"),
(default, "Bose Bass", 700.00, 10, "Bass boosted", 9, "BMW"),
(default, "Bose Full System", 1400.00, 10, "Surround sound for a great experience", 9, "BMW"),
(default, "JBL BMW Sound", 800.00, 10, "High fidelity audio", 9, "BMW"),
(default, "JBL Bass T-System", 900.00, 10, "Bass boosted", 9, "BMW"),
(default, "Beats Full System BMW", 5000.00, 10, "Surround sound for a regular experience", 9, "BMW"),
(default, "Bose Hi-Fi", 700.00, 10, "High fidelity audio", 9, "Mini"),
(default, "Bose Bass", 700.00, 10, "Bass boosted", 9, "Mini"),
(default, "Bose Full System", 1400.00, 10, "Surround sound for a great experience", 9, "Mini"),
(default, "Sony Surround System", 1300.00, 10, "Surround sound for an excelent experience", 9, "Mini"),
(default, "Sony Full System", 1600.00, 10, "Surround sound for a great experience and excelent bass notes", 9, "Mini"),
(default, "Beats Full System Mini", 5000.00, 10, "Surround sound for a regular experience", 9, "Mini"),
(default, "Bose Hi-Fi", 1700.00, 10, "High fidelity audio", 9, "RollsRoyce"),
(default, "Bose Bass", 700.00, 10, "Bass boosted", 9, "RollsRoyce"),
(default, "Bose Full System", 3400.00, 10, "Surround sound for a great experience", 9, "RollsRoyce"),
(default, "Beats Dre System", 1300.00, 10, "Great music system", 9, "Mini"),
(default, "Beats Full 8D System", 4000.00, 10, "Surround sound for a regular experience", 9, "Mini"),


(default, "White leds", 400.00, 10, "High glow", 10, "BMW"),
(default, "Yellow leds", 200.00, 10, "Ready for every situation", 10, "BMW"),
(default, "Impact lights", 700.00, 10, "Adaptative lights", 10, "BMW"),
(default, "Experimental lights", 900.00, 10, "Solar Powered lights, with light sensors enabling auto turning on/off", 10, "BMW"),
(default, "White leds", 400.00, 10, "High glow", 10, "Mini"),
(default, "Yellow leds", 200.00, 10, "Ready for every situation", 10, "Mini"),
(default, "Impact lights", 800.00, 10, "Adaptative lights", 10, "Mini"),
(default, "Experimental lights", 900.00, 10, "Solar Powered lights, with light sensors enabling auto turning on/off", 10, "Mini"),
(default, "White leds", 400.00, 10, "High glow", 10, "RollsRoyce"),
(default, "Yellow leds", 200.00, 10, "Ready for every situation", 10, "RollsRoyce"),
(default, "Experimental lights", 1000.00, 10, "Solar Powered lights, with light sensors enabling auto turning on/off", 10, "RollsRoyce"),
(default, "Impact lights", 700.00, 10, "Adaptative lights", 10, "RollsRoyce"),

(default, "Ultra",200,20,"Smoke car Window 70%",11,"BMW"),
(default, "Medium",150,20,"Smoke car Window 60%",11,"BMW"),
(default, "Low",100,20,"Smoke car Window 50%",11,"BMW"),
(default, "Ultra",225,20,"Smoke car Window 70%",11,"Mini"),
(default, "Medium",170,20,"Smoke car Window 60%",11,"Mini"),
(default, "Low",150,20,"Smoke car Window 50%",11,"Mini"),
(default, "Ultra",800,20,"Smoke car Window 70%",11,"RollsRoyce"),
(default, "Medium",500,20,"Smoke car Window 60%",11,"RollsRoyce"),
(default, "Low",300,20,"Smoke car Window 50%",11,"RollsRoyce"),

(default, "M Performance Eletronic",2500,20,"Steering wheel for best performace",12,"BMW"),
(default, "M Comfort Eletronic",1000,20,"Steering wheel for best confort",12,"BMW"),
(default, "M Economic Eletronic",500,20,"Steering wheel for economic choice",12,"BMW"),
(default, "III Alcantara",999,20,"Leather Steering Wheel",12,"BMW"),
(default, "M Performance Eletronic",2250,20,"Steering wheel for best performace",12,"Mini"),
(default, "M Comfort Eletronic",1500,20,"Steering wheel for best confort",12,"Mini"),
(default, "M Economic Eletronic",750,20,"Steering wheel for economic choice",12,"Mini"),
(default, "III Alcantara",999,20,"Leather Steering Wheel",12,"Mini"),
(default, "M Performance Eletronic",7000,20,"Steering wheel for best performace",12,"RollsRoyce"),
(default, "M Comfort Eletronic",5000,20,"Steering wheel for best confort",12,"RollsRoyce"),
(default, "M Economic Eletronic",3000,20,"Steering wheel for economic choice",12,"RollsRoyce"),
(default, "III Alcantara",999,20,"Leather Steering Wheel",12,"RollsRoyce"),

(default, "Eletronic",4000,20,"Eletronic Sliding roof",13,"BMW"),
(default, "Manual",1000,20,"Eletronic Sliding roof",13,"BMW"),
(default, "Eletronic",4500,20,"Eletronic Sliding roof",13,"Mini"),
(default, "Eletronic",6000,20,"Eletronic Sliding roof",13,"RollsRoyce"),

(default, "Dual Rear Seat Entertainment",1500,20,"DVD screens",14,"BMW"),
(default, "Rear Seat Entertainment",1000,20,"DVD screens",14,"BMW"),
(default, "Dual Rear Seat Entertainment",1700,20,"DVD screens",14,"Mini"),
(default, "Rear Seat Entertainment",1100,20,"DVD screens",14,"Mini"),
(default, "Dual Rear Seat Entertainment",3000,20,"DVD screens",14,"RollsRoyce"),
(default, "Rear Seat Entertainment",2000,20,"DVD screens",14,"RollsRoyce"),

(default, "All Weather Mats",180,20,"Floor Mats ",15,"BMW"),
(default, "All Weather Rubber Mats",140,20,"Floor Mats",15,"BMW"),
(default, "Carpeted Floor Mats",190,20,"Floor Mats",15,"BMW"),
(default, "All Season Mats",130,20,"Floor Mats",15,"BMW"),
(default, "All Weather Mats",180,20,"Floor Mats ",15,"Mini"),
(default, "All Weather Rubber Mats",140,20,"Floor Mats",15,"Mini"),
(default, "Carpeted Floor Mats",190,20,"Floor Mats",15,"Mini"),
(default, "All Season Mats",130,20,"Floor Mats",15,"Mini"),
(default, "All Weather Mats",180,20,"Floor Mats ",15,"RollsRoyce"),
(default, "All Weather Rubber Mats",180,20,"Floor Mats",15,"RollsRoyce"),
(default, "Carpeted Floor Mats",290,20,"Floor Mats",15,"RollsRoyce"),
(default, "All Season Mats",230,20,"Floor Mats",15,"RollsRoyce");