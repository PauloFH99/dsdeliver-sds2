
import React from 'react';
import { StyleSheet,ScrollView, Text, View, Image } from 'react-native';
import { RectButton } from 'react-native-gesture-handler';
import Header from '../Header';
import Ordercard from '../OrderCard';

export default function Orders() {

    return (
        <>
            <Header />
            <ScrollView style={styles.container}>
                <Ordercard />
            </ScrollView>
        </>
    );
}

const styles = StyleSheet.create({
    container: {
        paddingRight: '5%',
        paddingLeft: '5%',
    }
});