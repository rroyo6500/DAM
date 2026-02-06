import 'package:flutter/material.dart';

void main() {
  runApp(const MainApp());
}

const double size = 125.0;

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Container(
                width: size,
                height: size,
                color: Colors.yellow,
                child: Icon(  
                  Icons.star_border,
                  color: Colors.black,
                  size: size * 0.25,
                ),
              ),
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Container(
                    width: size,
                    height: size,
                    color: Colors.green,
                    child: Icon(  
                      Icons.circle_outlined,
                      color: Colors.black,
                      size: size * 0.25,
                    ),
                  ),
                  Container(
                    width: size,
                    height: size,
                    color: Colors.orange,
                    child: Icon(  
                      Icons.system_update_alt_outlined,
                      color: Colors.black,
                      size: size * 0.25,
                    ),
                  ),
                ],
              ),
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Container(
                    width: size,
                    height: size,
                    color: Colors.blue,
                    child: Icon(  
                      Icons.circle,
                      color: Colors.yellow,
                      size: size * 0.25,
                    ),
                  ),
                  Container(
                    width: size,
                    height: size,
                    color: Colors.brown,
                    child: Icon(  
                      Icons.pentagon,
                      color: Colors.black,
                      size: size * 0.25,
                    ),
                  ),
                  Container(
                    width: size,
                    height: size,
                    color: Colors.red,
                    child: Icon(  
                      Icons.fire_truck,
                      color: Colors.black,
                      size: size * 0.25,
                    ),
                  ),
                ],
              ),
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Container(
                    width: size,
                    height: size,
                    color: Color.fromARGB(255, 0, 150, 136),
                    child: Icon(  
                      Icons.search,
                      color: Colors.black,
                      size: size * 0.25,
                    ),
                  ),
                  Container(
                    width: size,
                    height: size,
                    color: Colors.cyan,
                    child: Icon(  
                      Icons.account_balance,
                      color: Colors.black,
                      size: size * 0.25,
                    ),
                  ),
                  Container(
                    width: size,
                    height: size,
                    color: Colors.pink,
                    child: Icon(  
                      Icons.airplane_ticket,
                      color: Colors.black,
                      size: size * 0.25,
                    ),
                  ),
                  Container(
                    width: size,
                    height: size,
                    color: Colors.purple,
                    child: Icon(  
                      Icons.fireplace_outlined,
                      color: Colors.black,
                      size: size * 0.25,
                    ),
                  ),
                ],
              ),
              Container(
                width: size,
                height: size * 2,
                color: Colors.brown,
                child: Icon(  
                  Icons.nature,
                  color: Colors.black,
                  size: size * 0.25,
                ),
              ),
              Container(
                width: size * 6,
                height: size,
                color: Colors.green,
                child: Icon(  
                  Icons.grass,
                  color: Colors.black,
                  size: size * 0.25,
                ),
              ),
            ],
          ),
        )
      ),
    );
  }
}
