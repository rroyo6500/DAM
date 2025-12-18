import 'package:flutter/material.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body: Center(
          child: Row(
            //spacing: 20, //añade espacio entre los elementos. parecido a un margen
            //textDirection: TextDirection.rtl, //cambia la direccion del row (de izquierda a derecha o viceversa)
            mainAxisAlignment: MainAxisAlignment.center, // permite alinear los elementos en diferentes posiciones y formas (siempre en horizontal) [start, end, center, spaceBetween, spaceAround, spaceEvenly]
            textBaseline: TextBaseline.ideographic,
            children: [
              Container(
                width: 100,
                height: 100,
                color: Colors.red,
                child: Center(
                  child: Text("Hola"),
                ),
              ),
              Container(
                width: 100,
                height: 100,
                color: Colors.green,
              ),
              Container(
                width: 100,
                height: 100,
                color: Colors.blue,
              ),
            ],
          ),
        ),
      ),
    );
  }
}
