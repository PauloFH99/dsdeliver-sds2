import axios from "axios";

const API_URL = 'http://192.168.0.102:8080';// ou usar o heroku

export function fetchOrders() {

    return axios(`${API_URL}/orders`);
}

export function confirmDelivery(orderId : number) {

    return axios.put(`${API_URL}/orders/${orderId}delivery`);
}