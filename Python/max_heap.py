# implement a max heap

class MaxHeap:
    def __init__(self, numbers):
        self.heap = self.heapify(numbers)

    def heapify(self, numbers):
        parent_index = (len(numbers) - 2) // 2
        for current_index in reversed(range(parent_index + 1)):
            self.sift_down(current_index, len(numbers) - 1, numbers)

        return numbers

    def peek(self):
        return self.heap[0]

    def sift_up(self, current_index):
        parent_index = (current_index - 1) // 2
        while (current_index > 0 and
                self.heap[current_index] > self.heap[parent_index]):
            self.swap(current_index, parent_index, self.heap)

            current_index = parent_index
            parent_index = (current_index - 1) // 2

    def sift_down(self, current_index, end_index, heap):
        left_child_index = (2 * current_index) + 1
        while left_child_index <= end_index:
            right_child_index = (2 * current_index) + 2
            child_to_swap = left_child_index

            if (right_child_index < len(heap) and
                    heap[left_child_index] < heap[right_child_index]):
                child_to_swap = right_child_index

            if child_to_swap >= len(heap):
                break

            if heap[child_to_swap] < heap[current_index]:
                break
            else:
                self.swap(current_index, child_to_swap, heap)

            current_index = child_to_swap
            left_child_index = (2 * current_index) + 1

    def remove(self):
        self.swap(0, len(self.heap) - 1, self.heap)
        removed_value = self.heap.pop()
        self.sift_down(0, len(self.heap) - 1, self.heap)
        return removed_value

    def insert(self, value):
        self.heap.append(value)
        self.sift_up(len(self.heap) - 1)

    def swap(self, first_index, second_index, heap):
        heap[first_index], heap[second_index] = heap[second_index], heap[first_index]


if __name__ == "__main__":
    max_heap = MaxHeap([48, 12, 24, 7, 8, -5, 24, 391, 24, 56, 2, 6, 8, 41])
    max_heap.insert(76)
    max_heap.remove()
    max_heap.remove()
    max_heap.insert(87)
    print(max_heap.heap)
