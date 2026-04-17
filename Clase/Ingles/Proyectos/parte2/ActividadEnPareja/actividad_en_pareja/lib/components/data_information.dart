import 'package:flutter/material.dart';

class DataInformation extends StatelessWidget {
  const DataInformation({super.key, required this.padding, required this.title, this.children = const []});

  final double padding;
  final String title;
  final List<Widget> children;


  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: EdgeInsets.only(top: padding, bottom: padding),
      child: Column(
        mainAxisAlignment: MainAxisAlignment.start,
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Text(
            title,
            style: TextStyle(fontSize: 38, fontWeight: FontWeight.bold),
          ),
      
          Padding(
            padding: EdgeInsets.only(bottom: 10),
            child: Container(
              width: MediaQuery.widthOf(context) * 0.9,
              decoration: BoxDecoration(
                color: Colors.grey[300],
                border: Border.all(color: Colors.black, width: 2),
                borderRadius: BorderRadius.circular(10),
              ),
              child: Padding(
                padding: EdgeInsets.all(20.0),
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.start,
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: children,
                ),
              ),
            ),
          ),
        ],
      ),
    );
  }
}
